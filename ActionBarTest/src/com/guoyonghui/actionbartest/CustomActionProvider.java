package com.guoyonghui.actionbartest;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

@TargetApi(14)
public class CustomActionProvider extends ActionProvider {
	
	private static final String SUB_MENU_1 = "Flickr";

	private static final String SUB_MENU_2 = "Facebook";

	private Context mContext;

	public CustomActionProvider(Context context) {
		super(context);

		mContext = context;
	}

	@Override
	public View onCreateActionView() {
		return null;
	}

	@Override
	public void onPrepareSubMenu(SubMenu subMenu) {
		subMenu.clear();

		subMenu.add(SUB_MENU_1).setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Toast.makeText(mContext, SUB_MENU_1, Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		subMenu.add(SUB_MENU_2).setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Toast.makeText(mContext, SUB_MENU_2, Toast.LENGTH_SHORT).show();
				return false;
			}
		});
	}
	
	@Override
	public boolean hasSubMenu() {
		return true;
	}

}
