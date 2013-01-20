package com.hascode.android.dream;

import android.service.dreams.DreamService;

import com.hascode.dream_app.R;

public class SampleDream extends DreamService {

	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		setInteractive(false);
		setFullscreen(true);
		setContentView(R.layout.dream);
	}
}