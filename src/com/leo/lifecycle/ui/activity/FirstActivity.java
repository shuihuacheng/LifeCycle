package com.leo.lifecycle.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.leo.lifecycle.ui.R;

public class FirstActivity extends BaseActivity{
	private Button btn_next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		btn_next = (Button)findViewById(R.id.btn_next);
		btn_next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startToActivity(SecondActivity.class);
			}
		});
	}
	
	@Override
	public void setTAG() {
		TAG = "FirstActivity";
	}
}
