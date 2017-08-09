// generated in de.wwu.md2.framework.generator.android.lollipop.model.Md2ContentProvider.generateContentProvider()
package md2.einkaufszettel.md2.model.contentProvider;

import java.util.List;

import md2.einkaufszettel.md2.model.Artikel;
import de.uni_muenster.wi.md2library.model.contentProvider.implementation.AbstractMd2MultiContentProvider;
import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2LocalStore;
import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2DataStore;
import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Type;

import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Sensor;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2List;

public class SpaeterEinkaufenProvider extends AbstractMd2MultiContentProvider {
	@Override
	public void update(){
	}
	@Override
	public void overwriteContent(List<Md2Entity> list){

	}
  				    public SpaeterEinkaufenProvider(String key , Md2DataStore dataStore) {
  				        super(key, dataStore);
  				    }
  				    
  				    
  			  @Override
  			    			    public Md2Type getValue(int entityIndex,String attribute) {
  			    			  if(this.getContentsList()!=null && this.getContentsList().get(entityIndex)!=null){  				
  			    			switch (attribute){
  			    			case "bezeichnung": return  
  			    			new 
  			    			Md2String(((Artikel)this.getContentsList().get(entityIndex)).getBezeichnung());	
  			    			case "anzahl": return  
  			    			new 
  			    			Md2Integer(((Artikel)this.getContentsList().get(entityIndex)).getAnzahl());	
  			    			case "status": return  
  			    			new 
  			    			Md2Integer(((Artikel)this.getContentsList().get(entityIndex)).getStatus());	
  			    			default:return null;		
  			    			}
  			    			}
  			    			return null;
  			    			}
  			    			
  			    			 @Override
  			    			public void setValue(int entityIndex, String name, Md2Type value){
  			    			    if(this.getContentsList()==null && this.getContentsList().get(entityIndex)!=null) {
  			    			            return;
  			    			        }
  			    			
  			    			        // set only if value is different to current value
  			    			        if ((this.getValue(entityIndex,name) == null && value != null) || !this.getValue(entityIndex,name).equals(value)) {
  			    			        switch (name){
  			    			        			case "bezeichnung":   ((Artikel)this.getContentsList().get(entityIndex)).setBezeichnung(((Md2String) value).getPlatformValue());	
  			    			        				break;
  			    			        			case "anzahl":   ((Artikel)this.getContentsList().get(entityIndex)).setAnzahl(((Md2Integer) value).getPlatformValue());	
  			    			        				break;
  			    			        			case "status":   ((Artikel)this.getContentsList().get(entityIndex)).setStatus(((Md2Integer) value).getPlatformValue());	
  			    			        				break;
  			    			        			}
  				    
  				    
  				}	
  				}
  				}	  	
