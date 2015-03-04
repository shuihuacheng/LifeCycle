package com.leo.lifecycle.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.leo.lifecycle.ui.R;
import com.leo.lifecycle.utils.LogUtil;

public class FragmentActivityByLayout extends FragmentActivity{
	private static final String TAG = "FragmentActivityByLayout";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_activity_layout);
		
		LogUtil.i(TAG, "onCreate-->");
	}
	
	@Override
	protected void onStart() {
		LogUtil.i(TAG, "onStart-->");
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		LogUtil.i(TAG, "onResume-->");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		LogUtil.i(TAG, "onPause-->");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		LogUtil.i(TAG, "onStop-->");
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		LogUtil.i(TAG, "onDestroy-->");
		super.onDestroy();
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		LogUtil.i(TAG, "onSaveInstanceState-->");
		super.onSaveInstanceState(outState);
	}
	
	@Override
	protected void onRestart() {
		LogUtil.i(TAG, "onRestart-->");
		super.onRestart();
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		LogUtil.i(TAG, "onRestoreInstanceState-->");
		super.onRestoreInstanceState(savedInstanceState);
	}
}
