package com.leo.lifecycle.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.leo.lifecycle.ui.R;
import com.leo.lifecycle.ui.fragment.FirstFragment;
import com.leo.lifecycle.ui.fragment.SecondFragment;
import com.leo.lifecycle.utils.LogUtil;

public class FragmentActivityByAction extends FragmentActivity implements OnClickListener{
	private static final String TAG = "FragmentActivityByAction";
	private Button btn_add;
	private Button btn_remove;
	private Button btn_replace;
	
	FirstFragment firstFragment;
	SecondFragment secondFragment;
	
	@Override
	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		setContentView(R.layout.fragment_activity_action);
		LogUtil.i(TAG, "onCreate-->");
		if(findViewById(R.id.fragment_container) != null){
			
			if(saveInstanceState != null){
				return;
			}
			
		    firstFragment = new FirstFragment();
			firstFragment.setArguments(getIntent().getExtras());
		
			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();
			ft.add(R.id.fragment_container, firstFragment);
			ft.commit();
		}
		
		btn_add = (Button)findViewById(R.id.btn_add);
		btn_remove = (Button)findViewById(R.id.btn_remove);
		btn_replace = (Button)findViewById(R.id.btn_replace);
		
		btn_add.setOnClickListener(this);
		btn_remove.setOnClickListener(this);
		btn_replace.setOnClickListener(this);
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
	protected void onRestart() {
		LogUtil.i(TAG, "onRestart-->");
		super.onRestart();
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		
		switch(v.getId()){
		case R.id.btn_add:
			if(firstFragment == null) firstFragment = new FirstFragment();
			
			if(firstFragment != null && !firstFragment.isAdded()){
				ft.add(R.id.fragment_container, firstFragment);
//			ft.addToBackStack(null);
				ft.commit();
			}
			break;
		case R.id.btn_remove:
			if(firstFragment != null && firstFragment.isAdded()){
				ft.remove(firstFragment);
//			ft.addToBackStack(null);
				ft.commit();
			}else if(secondFragment != null && secondFragment.isAdded()){
				ft.remove(secondFragment);
//				ft.addToBackStack(null);
					ft.commit();
			}
			break;
		case R.id.btn_replace:
			if(secondFragment  == null){
				secondFragment = new SecondFragment();
			}
			
			if(secondFragment != null && !secondFragment.isAdded()){
				Bundle bundle = new Bundle();
				bundle.putString("key", "btn_replace");
				secondFragment.setArguments(getIntent().getExtras());
				ft.replace(R.id.fragment_container, secondFragment);
//			ft.addToBackStack(null);
				ft.commit();
			}
			
			break;
		}
		
	}
}
