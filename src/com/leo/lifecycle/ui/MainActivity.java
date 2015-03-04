package com.leo.lifecycle.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.leo.lifecycle.ui.activity.FirstActivity;
import com.leo.lifecycle.ui.activity.FragmentActivityByLayout;
import com.leo.lifecycle.ui.activity.FragmentActivityByAction;
import com.leo.lifecycle.utils.LogUtil;

public class MainActivity extends Activity implements OnClickListener{
	private static final String TAG = "MainActivity";
	private Button btn_toFirstActivity;
	private Button btn_toFragmentActivityByLayout;
	private Button btn_toFragmentActivityByAction;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LogUtil.i(TAG, "onCreate-->");
		btn_toFirstActivity = (Button)findViewById(R.id.btn_toFirstActivity);
		btn_toFragmentActivityByLayout = (Button)findViewById(R.id.btn_toFragmentActivityByLayout);
		btn_toFragmentActivityByAction = (Button)findViewById(R.id.btn_toFragmentActivityByAction);
		
		btn_toFirstActivity.setOnClickListener(this);
		btn_toFragmentActivityByLayout.setOnClickListener(this);
		btn_toFragmentActivityByAction.setOnClickListener(this);
		
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
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btn_toFirstActivity:
			startToActivity(FirstActivity.class);
			break;
		case R.id.btn_toFragmentActivityByLayout:
			startToActivity(FragmentActivityByLayout.class);
			break;
		case R.id.btn_toFragmentActivityByAction:
			startToActivity(FragmentActivityByAction.class);
			break;
			default:
				break;
		}
	}
	
	private void startToActivity(Class cls){
		Intent intent = new Intent(MainActivity.this,cls);
		startActivity(intent);
	}
}
