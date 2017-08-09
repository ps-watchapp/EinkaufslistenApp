			// generated in de.wwu.md2.framework.generator.android.lollipop.model.Md2ContentProvider.generateContentProvider()
			package md2.einkaufszettel.md2.model.contentProvider;

	
	
	

import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnAttributeChangedHandler;
			import java.util.HashMap;
			import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Type;
			import de.uni_muenster.wi.md2library.model.contentProvider.implementation.AbstractMd2ContentProvider;
			import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2LocalStore;
			import de.uni_muenster.wi.md2library.model.dataStore.interfaces.Md2DataStore;
			import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
			
			import md2.einkaufszettel.md2.model.Artikel;
			
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2Sensor;
			import de.uni_muenster.wi.md2library.model.type.implementation.Md2List;
			
			public class ArtikelBewegenProvider    extends AbstractMd2ContentProvider {
			
			    			
			    public ArtikelBewegenProvider(String key, Md2Entity content, Md2DataStore md2DataStore) {
			       super(key, content, md2DataStore);
			    }
			@Override
			    public String getKey() {
			        return this.key;
			    }
			@Override
			    protected long getInternalId() {
			        return this.internalId;
			    }
			@Override
			    protected void setInternalId(long internalId) {
			        this.internalId = internalId;
			    }
			@Override
			    public Md2Entity getContent() {
			        return this.content;
			    }
			@Override
			    public void setContent(Md2Entity content) {
			        if(content != null) {
			            this.content = content;
			            this.backup = (Md2Entity)content.clone();
			            this.internalId = -1L;
			            this.load();
			        }
			
			    }
			@Override
			    public void registerAttributeOnChangeHandler(String attribute, Md2OnAttributeChangedHandler onAttributeChangedHandler) {
			        this.attributeChangedEventHandlers.put(attribute, onAttributeChangedHandler);
			    }
			@Override
			    public void unregisterAttributeOnChangeHandler(String attribute) {
			        this.attributeChangedEventHandlers.remove(attribute);
			    }
			@Override
			    public Md2OnAttributeChangedHandler getOnAttributeChangedHandler(String attribute) {
			        return (Md2OnAttributeChangedHandler)this.attributeChangedEventHandlers.get(attribute);
			    }
			
			
			
			
			@Override
			    public Md2Type getValue(String attribute) {			
			switch (attribute){
			case "bezeichnung":
			if(((Artikel)content).getBezeichnung() != null){
			return  
			new 
			Md2String(((Artikel)content).getBezeichnung());	
			} else { return null;}
			case "anzahl":
			if(((Artikel)content).getAnzahl() != null){
			return  
			new 
			Md2Integer(((Artikel)content).getAnzahl());	
			} else { return null;}
			case "status":
			if(((Artikel)content).getStatus() != null){
			return  
			new 
			Md2Integer(((Artikel)content).getStatus());	
			} else { return null;}
			default:return null;		
			}
			}
			
			@Override
			public void setValue(String name, Md2Type value){
			     if (content == null) {
			            return;
			        }
			
			        // set only if value is different to current value
			        if ((this.getValue(name) == null && value != null) || value != null && !this.getValue(name).toString().equals(value.toString())) {
			        switch (name){

			        			case "bezeichnung":
			        			   ((Artikel)content).setBezeichnung(((Md2String) value).getPlatformValue());	
				        					notifyChangeHandler(name);
					        				break;

			        			case "anzahl":
			        			   
			        			   		// Umgang mit anderen Datentypen hier einfügen - derzeit kein Support für Listen innerhalb v. Entities
			        			   		// angenommen wird entweder Md2String oder passender Md2Type als value
			        			   		
			        			   		if(!(value instanceof Md2Integer)){
			        			   			if(!(value.getString().toString().isEmpty())) {
			        			   		 	((Artikel)content).setAnzahl(Integer.parseInt(value.getString().toString()));	
			        			   			notifyChangeHandler(name);
			        			   			}
			        			   		} else {
			        			   			((Artikel)content).setAnzahl(((Md2Integer)value).getPlatformValue());
			        			   		}
			        			   		break;

			        			case "status":
			        			   
			        			   		// Umgang mit anderen Datentypen hier einfügen - derzeit kein Support für Listen innerhalb v. Entities
			        			   		// angenommen wird entweder Md2String oder passender Md2Type als value
			        			   		
			        			   		if(!(value instanceof Md2Integer)){
			        			   			if(!(value.getString().toString().isEmpty())) {
			        			   		 	((Artikel)content).setStatus(Integer.parseInt(value.getString().toString()));	
			        			   			notifyChangeHandler(name);
			        			   			}
			        			   		} else {
			        			   			((Artikel)content).setStatus(((Md2Integer)value).getPlatformValue());
			        			   		}
			        			   		break;
			        			}
			        }	
			}
			
			    public void reset(){ 
			       
			    }
			
			
			
			@Override
			    public void load() {
			        if(!(this.content == null | this.md2DataStore == null)) {
			            if(this.content.getId() > 0L) {
			                this.existsInDataStore = true;
			                this.internalId = this.content.getId();
			            } else {


			
			            }
			        }
			    }
			@Override
			    public void save() {
			        if(this.content != null && this.md2DataStore != null) {
			            if(this.existsInDataStore) {
			                this.md2DataStore.put(this.internalId, this.content);
			            } else {

			            }
			
			            this.backup = (Md2Entity)this.content.clone();
			        }
			    }
			@Override
			    public void remove() {
			        if(this.content != null && this.md2DataStore != null) {

			            this.internalId = -1L;
			        }
			    }
			
			@Override
				public void newEntity(){
					content = new Artikel();
				}
			
			}
