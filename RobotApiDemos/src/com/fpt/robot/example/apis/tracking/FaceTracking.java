package com.fpt.robot.example.apis.tracking;

import android.os.Bundle;

import com.fpt.robot.example.apis.R;
import com.fpt.robot.example.apis.R.layout;
import com.fpt.robot.example.apis.R.menu;
import com.fpt.robot.ui.RobotActivity;
import android.view.Menu;

public class FaceTracking extends RobotActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_face_tracking);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.face_tracking, menu);
		return true;
	}

	@Override
	protected int getLayoutID() {
		return R.layout.activity_face_tracking;
	}

}
