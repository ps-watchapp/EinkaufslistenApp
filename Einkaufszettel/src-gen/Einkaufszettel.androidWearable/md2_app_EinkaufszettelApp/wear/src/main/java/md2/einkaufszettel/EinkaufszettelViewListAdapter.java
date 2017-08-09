//generated in de.wwu.md2.framework.generator.android.wearable.controller.Activity.generateListAdapter()

package md2.einkaufszettel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.view.Display;
import android.view.Gravity;
import android.view.WindowManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2ButtonOnSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnClickHandler;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2Button;
import de.uni_muenster.wi.md2library.controller.action.interfaces.Md2Action;
import de.uni_muenster.wi.md2library.model.contentProvider.implementation.Md2ContentProviderRegistry;
import de.uni_muenster.wi.md2library.model.contentProvider.interfaces.Md2ContentProvider;
import de.uni_muenster.wi.md2library.model.contentProvider.interfaces.Md2MultiContentProvider;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2UpdateListIndexAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2RefreshListAction;

import md2.einkaufszettel.md2.controller.action.Einkaufszettel_Einkaufszettel_StarteArtikelAnsehen_Action;
import md2.einkaufszettel.md2.controller.action.Einkaufszettel_Einkaufszettel_BewegeArtikelSpaeterEinkaufen_Action;
import md2.einkaufszettel.md2.controller.action.Einkaufszettel_Einkaufszettel_BewegeArtikelEinkaufswagen_Action;

public class EinkaufszettelViewListAdapter extends RecyclerView.Adapter{
	
	private Md2MultiContentProvider content;
	private Md2ButtonOnSwipeHandler swipeHandler;
	private Md2OnClickHandler clickHandler;
	
	public Md2ButtonOnSwipeHandler getOnSwipeHandler(){
		return swipeHandler;
	}
	
	public Md2OnClickHandler getOnClickHandler(){
		return clickHandler;
	}
	
	public EinkaufszettelViewListAdapter(){
		content = Md2ContentProviderRegistry.getInstance().getContentMultiProvider("EinkaufszettelProvider");
		swipeHandler = new Md2ButtonOnSwipeHandler();
		clickHandler = new Md2OnClickHandler();
		Md2Action ca = new Einkaufszettel_Einkaufszettel_StarteArtikelAnsehen_Action();
		clickHandler.registerAction(ca);
		Md2Action lsa = new Einkaufszettel_Einkaufszettel_BewegeArtikelSpaeterEinkaufen_Action();
		swipeHandler.getLeftSwipeHandler().registerAction(lsa);
		Md2Action rsa = new Einkaufszettel_Einkaufszettel_BewegeArtikelEinkaufswagen_Action();
		swipeHandler.getRightSwipeHandler().registerAction(rsa);
	}
	
	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder vh, int i){
		ListItem li = (ListItem) vh;
		if(content.getValue(i,"bezeichnung") != null){
			li.getButton().setText(content.getValue(i,"bezeichnung").getString().toString());
		} else {
			li.getButton().setText("Fehler");
		}
		//Listener hinzufügen
		Md2UpdateListIndexAction indexAction = new Md2UpdateListIndexAction("EinkaufszettelView", i, content);
		Md2OnClickHandler ch = new Md2OnClickHandler();
		Md2ButtonOnSwipeHandler sw = new Md2ButtonOnSwipeHandler();
		ch.registerAction(indexAction);
		ch.addActions(clickHandler.getActions());
		sw.registerAction(indexAction, true);
		sw.registerAction(indexAction, false);
		sw.getLeftSwipeHandler().addActions(swipeHandler.getLeftSwipeHandler().getActions());
		sw.getRightSwipeHandler().addActions(swipeHandler.getRightSwipeHandler().getActions());
		Md2RefreshListAction rflaction = new Md2RefreshListAction(this);
		ch.registerAction(rflaction);
		sw.registerAction(rflaction, true);
		sw.registerAction(rflaction, false);
		li.getButton().setOnClickHandler(ch);
		li.getButton().setOnSwipeHandler(sw);
	}
	
	@Override
	public int getItemCount() {
		return content.getContents().size();
	}
	
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup vg, int i){
		Md2Button b = new Md2Button (vg.getContext());
		ListItem li = new ListItem(b);
		return li;
	}
	
	public class ListItem extends RecyclerView.ViewHolder{
		
		private Md2Button button;
		
		public ListItem(View itemView){
			super(itemView);
			button = (Md2Button) itemView;
			button.setBackgroundColor(Color.TRANSPARENT);
			WindowManager wm = (WindowManager) EinkaufszettelApp.getAppContext().getSystemService(Context.WINDOW_SERVICE);
			Display display = wm.getDefaultDisplay();
			Point size = new Point();
			display.getSize(size);
			int width = size.x;
			button.setWidth(width);
			button.setGravity(Gravity.LEFT);
		}
		
		public Md2Button getButton(){
			return button;
		}
		
		
	}
	
}

