package com.leo.lifecycle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.lifecycle.ui.R;

public class FirstFragment extends BaseFragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first, container,false);
		return view;
	}

	@Override
	protected void setTAG() {
		this.TAG = "FirstFragment";
	}
	
}
