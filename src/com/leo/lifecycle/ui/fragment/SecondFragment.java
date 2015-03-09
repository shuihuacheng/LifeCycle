package com.leo.lifecycle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.lifecycle.ui.R;
import com.leo.lifecycle.utils.LogUtil;

public class SecondFragment extends BaseFragment{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if(savedInstanceState != null){
			String str = savedInstanceState.getString("key");
			LogUtil.i(TAG, str);
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_second, container,false);
		return view;
	}

	@Override
	protected void setTAG() {
		this.TAG = "SecondFragment";
	}
	
}
