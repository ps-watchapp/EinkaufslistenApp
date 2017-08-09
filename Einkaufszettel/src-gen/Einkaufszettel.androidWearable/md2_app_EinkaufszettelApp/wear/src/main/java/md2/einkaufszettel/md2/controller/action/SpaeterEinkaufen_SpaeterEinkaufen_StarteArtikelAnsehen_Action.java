// generated in de.wwu.md2.framework.generator.android.wearable.controller.Actions.generateAction()
package md2.einkaufszettel.md2.controller.action;

import md2.einkaufszettel.EinkaufszettelApp;
import md2.einkaufszettel.R;

import md2.einkaufszettel.md2.controller.Controller;
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
import de.uni_muenster.wi.md2library.model.contentProvider.implementation.Md2ContentProviderRegistry;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2ViewManager;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2TaskQueue;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderAddAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderRemoveActiveAction;
import de.uni_muenster.wi.md2library.controller.action.implementation.Md2ContentProviderGetActiveAction;

public class SpaeterEinkaufen_SpaeterEinkaufen_StarteArtikelAnsehen_Action extends AbstractMd2Action {

    public SpaeterEinkaufen_SpaeterEinkaufen_StarteArtikelAnsehen_Action() {
		super("SpaeterEinkaufen_SpaeterEinkaufen_StarteArtikelAnsehen_Action"); 
	}

    @Override
    public void execute() {
    	
		Md2CallTask var1 = null;
		try {
			var1 = new Md2CallTask(new Md2ContentProviderGetActiveAction("ArtikelAnsehenProvider","SpaeterEinkaufenProvider"));
			var1.execute();
		}catch (Md2WidgetNotCreatedException e){
			Md2TaskQueue.getInstance().addPendingTask(var1);
		}
		Md2CallTask var2 = null;
		try {
			var2 = new Md2CallTask(new Md2FireEventAction("StarteArtikelAnsehen"));
			var2.execute();
		}catch (Md2WidgetNotCreatedException e){
			Md2TaskQueue.getInstance().addPendingTask(var2);
		}
	}
}
