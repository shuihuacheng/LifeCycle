package com.leo.lifecycle.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.leo.lifecycle.ui.R;

public class ThirdActivity extends BaseActivity{
	private Button btn_next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		btn_next = (Button)findViewById(R.id.btn_next);
		btn_next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startToActivity(FirstActivity.class);
//				Intent intent = new Intent(ThirdActivity.this,FirstActivity.class);
//				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//				startActivity(intent);
			}
		});
	}

	@Override
	public void setTAG() {
		TAG = "ThirdActivity";
	}
	
}
