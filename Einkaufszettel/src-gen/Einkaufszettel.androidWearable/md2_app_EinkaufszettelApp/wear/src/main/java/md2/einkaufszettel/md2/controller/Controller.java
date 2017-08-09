
// generated in de.wwu.md2.framework.generator.android.lollipop.controller.Md2Controller.generateController()
package md2.einkaufszettel.md2.controller;

import android.app.Activity;

import md2.einkaufszettel.EinkaufszettelApp;

import md2.einkaufszettel.md2.model.Artikel;
import md2.einkaufszettel.md2.model.__ReturnStepStack;
import md2.einkaufszettel.md2.model.__ProcessChainControllerState;

import md2.einkaufszettel.md2.model.contentProvider.ArtikelHinzufuegenProvider;
import md2.einkaufszettel.md2.model.contentProvider.ArtikelAnsehenProvider;
import md2.einkaufszettel.md2.model.contentProvider.ArtikelBewegenProvider;
import md2.einkaufszettel.md2.model.contentProvider.EinkaufszettelProvider;
import md2.einkaufszettel.md2.model.contentProvider.SpaeterEinkaufenProvider;
import md2.einkaufszettel.md2.model.contentProvider.EinkaufswagenProvider;
import md2.einkaufszettel.md2.model.contentProvider.__returnStepStackProvider;
import md2.einkaufszettel.md2.model.contentProvider.__processChainControllerStateProvider;

import java.util.ArrayList;
import java.util.HashSet;

import de.uni_muenster.wi.md2library.model.contentProvider.interfaces.Md2MultiContentProvider;
import de.uni_muenster.wi.md2library.model.dataStore.implementation.Md2RemoteStoreFactory;

import de.uni_muenster.wi.md2library.controller.action.implementation.AbstractMd2Action;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderOperationAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderOperations;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderResetAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2DisplayMessageAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2FireEventAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2GoToViewAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2SynchronizeContentProviderDataMappingAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2SynchronizeWidgetDataMappingAction;
import de.uni_muenster.wi.md2library.controller.action.interfaces.Md2Action;

import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;

import de.uni_muenster.wi.md2library.model.type.implementation.Md2Sensor;

import de.uni_muenster.wi.md2library.exception.Md2WidgetNotCreatedException;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2ContentProviderEventTypes;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnAttributeChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnClickHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnLongClickHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnLeftSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnRightSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2WidgetEventType;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.interfaces.Md2CustomCodeTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2AttributeSetTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2BindTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2CallTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2MapTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2UnbindTask;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2UnmapTask;

import de.uni_muenster.wi.md2library.controller.implementation.AbstractMd2Controller;
import de.uni_muenster.wi.md2library.model.contentProvider.implementation.Md2ContentProviderRegistry;
import de.uni_muenster.wi.md2library.model.contentProvider.interfaces.Md2ContentProvider;
import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2SQLiteHelper;
import de.uni_muenster.wi.md2library.model.dataStore.implementation.Md2SQLiteDataStore;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2ViewManager;
import de.uni_muenster.wi.md2library.workflow.Md2WorkflowEventRegistry;
import de.uni_muenster.wi.md2library.workflow.Md2WorkflowElement;
import de.uni_muenster.wi.md2library.workflow.Md2WorkflowAction;
import md2.einkaufszettel.md2.model.sqlite.Md2LocalStoreFactory;

public class Controller extends AbstractMd2Controller {

	protected ArrayList<Md2CustomCodeTask> pendingTasks;

    private static Controller instance;

    private Controller() {
        pendingTasks = new ArrayList<Md2CustomCodeTask>();
    }

    public static synchronized Controller getInstance() {
        if (Controller.instance == null) {
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }

    @Override
    public void run() {
        this.registerContentProviders();
        this.registerWorkflowEvents();
    }

    public void registerContentProviders() {
        Md2ContentProviderRegistry cpr = Md2ContentProviderRegistry.getInstance();
        Md2LocalStoreFactory lsf = new Md2LocalStoreFactory(this.instance);
        Md2RemoteStoreFactory rsf= new Md2RemoteStoreFactory();
Md2ContentProvider artikelHinzufuegenProvider = new ArtikelHinzufuegenProvider("ArtikelHinzufuegenProvider",new Artikel(),  lsf.getDataStore("Artikel"));
cpr.add("ArtikelHinzufuegenProvider", artikelHinzufuegenProvider);


Md2ContentProvider artikelAnsehenProvider = new ArtikelAnsehenProvider("ArtikelAnsehenProvider",new Artikel(),  lsf.getDataStore("Artikel"));
cpr.add("ArtikelAnsehenProvider", artikelAnsehenProvider);


Md2ContentProvider artikelBewegenProvider = new ArtikelBewegenProvider("ArtikelBewegenProvider",new Artikel(),  lsf.getDataStore("Artikel"));
cpr.add("ArtikelBewegenProvider", artikelBewegenProvider);


Md2MultiContentProvider einkaufszettelProvider = new EinkaufszettelProvider( "EinkaufszettelProvider",lsf.getDataStore("Artikel"));
cpr.addMultiContentProvider("EinkaufszettelProvider", einkaufszettelProvider);


Md2MultiContentProvider spaeterEinkaufenProvider = new SpaeterEinkaufenProvider( "SpaeterEinkaufenProvider",lsf.getDataStore("Artikel"));
cpr.addMultiContentProvider("SpaeterEinkaufenProvider", spaeterEinkaufenProvider);


Md2MultiContentProvider einkaufswagenProvider = new EinkaufswagenProvider( "EinkaufswagenProvider",lsf.getDataStore("Artikel"));
cpr.addMultiContentProvider("EinkaufswagenProvider", einkaufswagenProvider);


Md2ContentProvider __returnStepStackProvider = new __returnStepStackProvider("__returnStepStackProvider",new __ReturnStepStack(),  lsf.getDataStore("__ReturnStepStack"));
cpr.add("__returnStepStackProvider", __returnStepStackProvider);


Md2ContentProvider __processChainControllerStateProvider = new __processChainControllerStateProvider("__processChainControllerStateProvider",new __ProcessChainControllerState(),  lsf.getDataStore("__ProcessChainControllerState"));
cpr.add("__processChainControllerStateProvider", __processChainControllerStateProvider);


    }
    
    public void registerWorkflowEvents() {
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionStarteArtikelAnsehen",
    	    new Md2WorkflowElement("ArtikelAnsehen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelAnsehen___ArtikelAnsehen_startupAction_Action()),
    	    Md2WorkflowAction.START);
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionStarteArtikelHinzufuegen",
    	    new Md2WorkflowElement("ArtikelHinzufuegen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelHinzufuegen___ArtikelHinzufuegen_startupAction_Action()),
    	    Md2WorkflowAction.START);
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionStarteArtikelAnsehen",
    	    new Md2WorkflowElement("ArtikelAnsehen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelAnsehen___ArtikelAnsehen_startupAction_Action()),
    	    Md2WorkflowAction.START);
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionStarteArtikelAnsehen",
    	    new Md2WorkflowElement("ArtikelAnsehen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelAnsehen___ArtikelAnsehen_startupAction_Action()),
    	    Md2WorkflowAction.START);
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionCloseEvent",
    	    new Md2WorkflowElement("ArtikelAnsehen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelAnsehen___ArtikelAnsehen_startupAction_Action()),
    	    Md2WorkflowAction.END);
    	    
    	Md2WorkflowEventRegistry.getInstance().addWorkflowEvent(
    	    "Md2FireEventActionCloseEvent",
    	    new Md2WorkflowElement("ArtikelHinzufuegen", 
    	    	new md2.einkaufszettel.md2.controller.action.ArtikelHinzufuegen___ArtikelHinzufuegen_startupAction_Action()),
    	    Md2WorkflowAction.END);
    }

    @Override
    public Md2SQLiteHelper getMd2SQLiteHelper() {
        return EinkaufszettelApp.getMd2SQLiteHelper();
    }
}
