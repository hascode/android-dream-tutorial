package com.hascode.android.dream_app;

import android.content.SharedPreferences;
import android.service.dreams.DreamService;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SampleDream extends DreamService {

	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		setInteractive(false);
		setFullscreen(true);
		setContentView(R.layout.dream);
		TextView animatedText = (TextView) findViewById(R.id.animatedText);
		final SharedPreferences settings = getSharedPreferences(
				CustomDreamSettingsActivity.PREFS_KEY, 0);
		boolean animate = settings.getBoolean("animateDream", true);
		if (animate) {
			Animation animation = AnimationUtils.loadAnimation(this,
					R.anim.dream_animation);
			animation.reset();
			animatedText.startAnimation(animation);
		}
	}
}