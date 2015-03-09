package com.leo.lifecycle.ui.activity;

import com.leo.lifecycle.utils.LogUtil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseFragmentActivity extends FragmentActivity{
	protected String TAG = "BaseFragmentActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTAG();
		LogUtil.i(TAG,"onCreate-->TaskId:"+getTaskId());
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
	
	@Override
	protected void onNewIntent(Intent intent) {
		LogUtil.i(TAG,"onNewIntent--->TaskId:"+getTaskId());
		super.onNewIntent(intent);
	}

	protected abstract void setTAG();
}
