// generated in de.wwu.md2.framework.generator.android.wearable.controller.Activity.generateActivity()
package md2.einkaufszettel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.drawer.WearableDrawerLayout;
import android.support.wearable.view.drawer.WearableDrawerView;
import android.support.wearable.view.drawer.WearableNavigationDrawer;

import android.support.wearable.view.drawer.WearableActionDrawer;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;

import android.support.wearable.view.CurvedChildLayoutManager;
import android.support.wearable.view.WearableRecyclerView;


import md2.einkaufszettel.md2.controller.Controller;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2ViewManager;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2WidgetRegistry;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2TaskQueue;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2GridLayoutPane;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2FlowLayoutPane;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2Label;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2Button;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2TextInput;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;

import de.uni_muenster.wi.md2library.model.type.implementation.Md2Sensor;

import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2ContentProviderEventTypes;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnAttributeChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnClickHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnLongClickHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnLeftSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnRightSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2WidgetEventType;




import de.uni_muenster.wi.md2library.SensorHelper;


public class EinkaufswagenViewActivity extends WearableActivity implements WearableActionDrawer.OnMenuItemClickListener {

	private WearableDrawerLayout drawerLayout;
	private WearableNavigationDrawer navigationDrawer;
	private NavigationAdapter adapter;
	private WearableActionDrawer actionDrawer;
	public Md2OnClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einkaufswagenview);

        clickHandler = new Md2OnClickHandler();


	     		drawerLayout = (WearableDrawerLayout) findViewById(R.id.drawer_layout_EinkaufswagenView);
	        	drawerLayout.setDrawerStateCallback(new WearableDrawerLayout.DrawerStateCallback() {
	           		@Override
	            	public void onDrawerOpened(View view) {
	            		navigationDrawer.setCurrentItem(adapter.getActive(), true);
	            	}
	            	@Override
	            	public void onDrawerClosed(View view) {
	                	if(adapter.close()){
	                		EinkaufswagenViewActivity.this.finish();
	                	}
	            	}
	            	@Override
	            	public void onDrawerStateChanged(@WearableDrawerView.DrawerState int i) {
	            		if(i == 0){
	            		   if(!navigationDrawer.isOpened()) {
                          	 navigationDrawer.closeDrawer();
                          }
                       }
	            	}
	        	});


        navigationDrawer = (WearableNavigationDrawer) findViewById(R.id.navigation_drawer_EinkaufswagenView);
        adapter = NavigationAdapter.getInstance();
        navigationDrawer.setAdapter(adapter);




        navigationDrawer.setCurrentItem(adapter.getActive(), true);

		WearableRecyclerView wrv = (WearableRecyclerView) findViewById(R.id.wearable_recycler_view_EinkaufswagenView);
							    	EinkaufswagenViewListAdapter listAdapter = new EinkaufswagenViewListAdapter();
								   	wrv.setAdapter(listAdapter);
							    	wrv.setCenterEdgeItems(true);
							    	CurvedChildLayoutManager clm = new CurvedChildLayoutManager(this);
							    	wrv.setLayoutManager(clm);



    }

    @Override
    protected void onStart(){
		super.onStart();
        Md2ViewManager.getInstance().setActiveView(this);


        drawerLayout.peekDrawer(Gravity.TOP);
        drawerLayout.peekDrawer(Gravity.BOTTOM);

        adapter.maybeFirstStart();


        Md2TaskQueue.getInstance().tryExecutePendingTasks();


    }

	@Override
    protected void onPause(){
        super.onPause();
    }

    @Override
	public void onBackPressed() {
		// go back to start screen
		Md2ViewManager.getInstance().goTo(getString(R.string.StartActivity));
	}

	@Override
	public boolean onMenuItemClick(MenuItem menuItem) {

return true;

	}
}
