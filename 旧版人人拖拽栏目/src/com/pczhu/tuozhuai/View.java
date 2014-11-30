package com.pczhu.tuozhuai;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class View extends LinearLayout {
	private String title = null;
	Context context;
	public View(Context context) {
		
		super(context);
		this.context = context;
	}
	public View(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}
	public View(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void init(){
		View v = (View) inflate(context, R.layout.item_ll, null);
		TextView tv = (TextView) v.findViewById(R.id.title);
		GridView gv = (GridView) v.findViewById(R.id.gv_home);
	}
	public void move(){
		
	}

}
