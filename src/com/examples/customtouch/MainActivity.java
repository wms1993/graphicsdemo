/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package com.examples.customtouch;

import com.ljm.testmultitouch.MultiTouchDemoActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

/***
 * 多种点击事件的控制方式， 重点参考Multi-Touch Example 多点触控
 * */
public class MainActivity extends ListActivity implements OnItemClickListener {

	private static final String[] ITEMS = {
            "Move Logger Example", "Touch Listener Example",
            "Touch Delegate Example", "Touch Forward Example",
            "Pan Example", "Pan Gesture Example",
	        "Multi-Touch Example 多点触控", "Disable Touch Intercept","MultiTouchDemoActivity","简单缩放Scale Example","TestMultiTouchEventActivity"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ITEMS);
		getListView().setAdapter(adapter);
		getListView().setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0: //Move Logger View
                startActivity(new Intent(this, MoveLoggerActivity.class));
                break;
            case 1: //Touch Listener
                startActivity(new Intent(this, TouchListenerActivity.class));
                break;
            case 2: //Touch Delegate
                startActivity(new Intent(this, TouchDelegateActivity.class));
                break;
            case 3: //Touch Forwarding
                startActivity(new Intent(this, TouchForwardActivity.class));
                break;
            case 4: //2D Scrolling
                startActivity(new Intent(this, TwoDimensionScrollActivity.class));
                break;
            case 5: //2D GestureDetector Scrolling
                startActivity(new Intent(this, TwoDimensionGestureScrollActivity.class));
                break;
            case 6: //Multi-Touch Image View
                startActivity(new Intent(this, MultitouchActivity.class));
                break;
            case 7: //Disable Touch Intercept
                startActivity(new Intent(this, TouchInterceptActivity.class));
                break;
            case 8: //Disable Touch Intercept
                startActivity(new Intent(this, MultiTouchDemoActivity.class));
                break;
            case 9: //Disable Touch Intercept
                startActivity(new Intent(this, com.ljm.gesture.easysample.MainActivity.class));
                break;
            case 10: //Disable Touch Intercept
                startActivity(new Intent(this, com.ljm.testmultitouch.TestMultiTouchEventActivity.class));
                break;  
            default:
                break;
        }
    }
}
