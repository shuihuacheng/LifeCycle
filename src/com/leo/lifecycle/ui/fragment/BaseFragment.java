package com.leo.lifecycle.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.leo.lifecycle.utils.LogUtil;

public abstract class BaseFragment extends Fragment{
	protected String TAG = "BaseFragment";
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		setTAG();
		LogUtil.i(TAG, "onAttach-->");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtil.i(TAG, "onCreate-->");
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		LogUtil.i(TAG, "onActivityCreated-->");
	}
	
	@Override
	public void onStart() {
		super.onStart();
		LogUtil.i(TAG, "onStart-->");
	}
	
	@Override
	public void onResume() {
		super.onResume();
		LogUtil.i(TAG, "onResume-->");
	}
	
	@Override
	public void onPause() {
		super.onPause();
		LogUtil.i(TAG, "onPause-->");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		LogUtil.i(TAG, "onStop-->");
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		LogUtil.i(TAG, "onDestroyView-->");
	}
	
	@Override	
	public void onDestroy() {
		super.onDestroy();
		LogUtil.i(TAG, "onDestroy-->");
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		LogUtil.i(TAG, "onDetach-->");
	}
	
	protected abstract void setTAG();
		
}
