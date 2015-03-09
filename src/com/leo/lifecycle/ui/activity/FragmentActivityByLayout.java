package com.leo.lifecycle.ui.activity;

import android.os.Bundle;

import com.leo.lifecycle.ui.R;

public class FragmentActivityByLayout extends BaseFragmentActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_activity_layout);
		
	}

	@Override
	protected void setTAG() {
		this.TAG = "FragmentActivityByLayout";
	}
	
}
