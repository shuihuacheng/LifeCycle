package com.leo.lifecycle.ui.fragment;

import com.leo.lifecycle.ui.R;
import com.leo.lifecycle.utils.LogUtil;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment{
	private static final String TAG = "FirstFragment";
	
	@Override
	public void onAttach(Activity activity) {
		LogUtil.i(TAG, "onAttach-->");
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		LogUtil.i(TAG, "onCreate-->");
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first, container,false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		LogUtil.i(TAG, "onActivityCreated-->");
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onStart() {
		LogUtil.i(TAG, "onStart-->");
		super.onStart();
	}
	
	@Override
	public void onResume() {
		LogUtil.i(TAG, "onResume-->");
		super.onResume();
	}
	
	@Override
	public void onPause() {
		LogUtil.i(TAG, "onPause-->");
		super.onPause();
	}
	
	@Override
	public void onStop() {
		LogUtil.i(TAG, "onStop-->");
		super.onStop();
	}
	
	@Override
	public void onDestroyView() {
		LogUtil.i(TAG, "onDestroyView-->");
		super.onDestroyView();
	}
	
	@Override	
	public void onDestroy() {
		LogUtil.i(TAG, "onDestroy-->");
		super.onDestroy();
	}
	
	@Override
	public void onDetach() {
		LogUtil.i(TAG, "onDetach-->");
		super.onDetach();
	}
	
}
