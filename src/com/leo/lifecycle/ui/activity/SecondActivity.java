package com.leo.lifecycle.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.leo.lifecycle.ui.R;
import com.leo.lifecycle.utils.LogUtil;

public class SecondActivity extends BaseActivity{
	private Button btn_next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		btn_next = (Button)findViewById(R.id.btn_next);
		btn_next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startToActivity(ThirdActivity.class);
			}
		});
	}

	@Override
	public void setTAG() {
		TAG = "SecondActivity";
	}
	
}
