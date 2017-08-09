		// generated in de.wwu.md2.framework.generator.android.lollipop.model.Md2Entity.generateEntity()
		package md2.einkaufszettel.md2.model;
		
		import md2.einkaufszettel.md2.model.Artikel;	
		import md2.einkaufszettel.md2.model.__ReturnStepStack;	
		import md2.einkaufszettel.md2.model.__ProcessChainControllerState;	

		
		import java.util.HashMap;
		import java.util.List;
		import java.util.ArrayList;
		import java.io.Serializable;
		import com.j256.ormlite.field.DatabaseField;
		import com.j256.ormlite.dao.ForeignCollection;
		import com.j256.ormlite.field.ForeignCollectionField;
		import com.j256.ormlite.table.DatabaseTable;
		import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
		import de.uni_muenster.wi.md2library.model.type.implementation.AbstractMd2Entity;
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
@DatabaseTable(tableName = "__ProcessChainControllerState")
		public class __ProcessChainControllerState  implements Serializable,Md2Entity{
		
	//	@SerializedName("__internalId")
		@DatabaseField(generatedId = true, columnName = "id")
		    private long id;
		    
		      protected String typeName;
		@DatabaseField(columnName = "__ProcessChainControllerState_currentProcessChainStep")
		private String	currentProcessChainStep;		
		@DatabaseField(columnName = "__ProcessChainControllerState_lastEventFired")
		private String	lastEventFired;		
		
		
		
		    public __ProcessChainControllerState() {
		        super();
		    }
		    
		    		
		    @Override
		    public Md2Type clone() {
		   return null; //TODO
		    }
		
		
		@Override
			public Md2String getString() {
				return null;
			}
		
			@Override
			public boolean equals(Md2Type md2Type) {
				return false;}
		
			@Override
			public Md2Type get(String s) {
				return null;
			}
		
			@Override
			public void set(String s, Md2Type md2Type) {
		
			}
		
	
		
			@Override
			public HashMap<String, Md2Type> getAttributes() {
				return null;
			}
		
		 public long getId() {
		        return this.id;
		    }
		
		    public void setId(long id) {
		        this.id = id;
		    }
		
		 public String getTypeName() {
		        return this.typeName;
		    }
		
		public String getCurrentProcessChainStep(){
				return this.currentProcessChainStep;	
				}
				
		public void setCurrentProcessChainStep(String currentProcessChainStep ){
				this.currentProcessChainStep=currentProcessChainStep; 	
				}		
		public String getLastEventFired(){
				return this.lastEventFired;	
				}
				
		public void setLastEventFired(String lastEventFired ){
				this.lastEventFired=lastEventFired; 	
				}		
		
		@Override
		    public String toString() {
		        StringBuffer result = new StringBuffer();
		        result.append(this.getTypeName() + ": (");
		        result.append(this.currentProcessChainStep);
		        result.append(this.lastEventFired);
		
		        return result.append(")").toString();
		    }
		
		@Override
		    public boolean equals(Object value) {
		        if(value == null) {
		            return false;
		        } else if(!(value instanceof __ProcessChainControllerState)) {
		            return false;
		        } else {
		            __ProcessChainControllerState md2EntityValue = (__ProcessChainControllerState)value;
		            boolean b= true;
		           b &= this.currentProcessChainStep.equals(((__ProcessChainControllerState)md2EntityValue).getCurrentProcessChainStep()) ;
		           
		           b &= this.lastEventFired.equals(((__ProcessChainControllerState)md2EntityValue).getLastEventFired()) ;
		           
		
		            return b;
		        }
		    }
		}
		
