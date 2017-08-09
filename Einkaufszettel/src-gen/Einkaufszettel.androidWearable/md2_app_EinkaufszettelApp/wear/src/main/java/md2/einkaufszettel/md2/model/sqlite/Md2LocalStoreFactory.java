	package md2.einkaufszettel.md2.model.sqlite;
	import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
import de.uni_muenster.wi.md2library.controller.interfaces.Md2Controller;
import de.uni_muenster.wi.md2library.model.dataStore.implementation.AbstractMd2LocalStoreFactory;
import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2LocalStore;
import md2.einkaufszettel.md2.model.Artikel;
import md2.einkaufszettel.md2.model.__ReturnStepStack;
import md2.einkaufszettel.md2.model.__ProcessChainControllerState;


public class Md2LocalStoreFactory extends AbstractMd2LocalStoreFactory{
	
public Md2LocalStoreFactory(Md2Controller controller){
	super(controller);

}	

 public <T extends Md2Entity>  Md2LocalStore<T> getDataStore(String entity){
final String entityName= entity;
switch(entity){
	case "Artikel": return new Md2OrmLiteDatastore<Artikel>(entity); 	
	case "__ReturnStepStack": return new Md2OrmLiteDatastore<__ReturnStepStack>(entity); 	
	case "__ProcessChainControllerState": return new Md2OrmLiteDatastore<__ProcessChainControllerState>(entity); 	
default: throw new IllegalArgumentException("Unknown Entity Type: "+ entity); 
} 	
 	
 }





	
	
	
}



