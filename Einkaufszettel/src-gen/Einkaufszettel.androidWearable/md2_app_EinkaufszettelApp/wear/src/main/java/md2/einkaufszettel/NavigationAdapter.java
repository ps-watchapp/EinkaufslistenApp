// generated in de.wwu.md2.framework.generator.android.wearable.controller.Activity.generateStartActivity()
		package md2.einkaufszettel;
		
		import android.graphics.drawable.Drawable;
		import android.support.wearable.view.drawer.WearableNavigationDrawer;
		import de.uni_muenster.wi.md2library.controller.action.interfaces.Md2Action;
		import de.uni_muenster.wi.md2library.view.management.implementation.Md2ViewManager;
		import java.util.ArrayList;
		import md2.einkaufszettel.md2.controller.action.SpaeterEinkaufen___SpaeterEinkaufen_startupAction_Action;
		import md2.einkaufszettel.md2.controller.action.Einkaufszettel___Einkaufszettel_startupAction_Action;
		import md2.einkaufszettel.md2.controller.action.Einkaufswagen___Einkaufswagen_startupAction_Action;
		import md2.einkaufszettel.md2.controller.action.ArtikelHinzufuegen___ArtikelHinzufuegen_startupAction_Action;
		
		public class NavigationAdapter extends WearableNavigationDrawer.WearableNavigationDrawerAdapter{
			
			private static NavigationAdapter instance;
			private int active;
			private int selected;
			private ArrayList<String> names;
			private ArrayList<Md2Action> actions;
			private boolean isFirstStart;
			
			
			public static synchronized NavigationAdapter getInstance(){
			        if (NavigationAdapter.instance == null) {
			            NavigationAdapter.instance = new NavigationAdapter();
			        }
			        return instance;
			}
			
			private NavigationAdapter(){
				active = 0;
				selected = 0;
				isFirstStart = true;
				names = new ArrayList<String>();
				actions = new ArrayList<Md2Action>();
				names.add("SpaeterEinkaufen");
				actions.add(new SpaeterEinkaufen___SpaeterEinkaufen_startupAction_Action());
				names.add("Einkaufszettel");
				actions.add(new Einkaufszettel___Einkaufszettel_startupAction_Action());
				names.add("Einkaufswagen");
				actions.add(new Einkaufswagen___Einkaufswagen_startupAction_Action());
				names.add("ArtikelHinzufuegen");
				actions.add(new ArtikelHinzufuegen___ArtikelHinzufuegen_startupAction_Action());
			}
			
			@Override
			public int getCount() {
				return actions.size();
			}
			
			@Override
			public void onItemSelected(int position) {
				selected = position;
			}
			
			@Override
			public String getItemText(int pos) {
				return names.get(pos);
			}
			
			@Override
			public Drawable getItemDrawable(int position) {
	    			String  activity_name=Md2ViewManager.getInstance().getActiveView().getTitle().toString();
	    	       	
	                       return Md2ViewManager.getInstance().getActiveView().getDrawable(R.mipmap.ic_launcher);
	    	          
			}
			
			public int getActive(){
				return active;
			}
			
			public int getSelected(){
				return selected;
			}
			
			public void maybeFirstStart(){
				if(isFirstStart){
					actions.get(0).execute();
					isFirstStart = false;
				}
			}
			
			public boolean close(){
				if (active != selected){
					active = selected;
					actions.get(active).execute();
					return true;
				} else {
					return false;
				}
			}
			
		}
		
