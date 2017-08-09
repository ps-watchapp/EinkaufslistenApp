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
@DatabaseTable(tableName = "__ReturnStepStack")
		public class __ReturnStepStack  implements Serializable,Md2Entity{
		
	//	@SerializedName("__internalId")
		@DatabaseField(generatedId = true, columnName = "id")
		    private long id;
		    
		      protected String typeName;
		@DatabaseField(columnName = "__ReturnStepStack_returnStep")
		private String	returnStep;		
		@DatabaseField(columnName = "__ReturnStepStack_returnAndReverseStep")
		private String	returnAndReverseStep;		
		@DatabaseField(columnName = "__ReturnStepStack_returnAndProceedStep")
		private String	returnAndProceedStep;		
		@DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
		private __ReturnStepStack	tail;		
		
		
		
		    public __ReturnStepStack() {
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
		
		public String getReturnStep(){
				return this.returnStep;	
				}
				
		public void setReturnStep(String returnStep ){
				this.returnStep=returnStep; 	
				}		
		public String getReturnAndReverseStep(){
				return this.returnAndReverseStep;	
				}
				
		public void setReturnAndReverseStep(String returnAndReverseStep ){
				this.returnAndReverseStep=returnAndReverseStep; 	
				}		
		public String getReturnAndProceedStep(){
				return this.returnAndProceedStep;	
				}
				
		public void setReturnAndProceedStep(String returnAndProceedStep ){
				this.returnAndProceedStep=returnAndProceedStep; 	
				}		
		public __ReturnStepStack getTail(){
				return this.tail;	
				}
				
		public void setTail(__ReturnStepStack tail ){
				this.tail=tail; 	
				}		
		
		@Override
		    public String toString() {
		        StringBuffer result = new StringBuffer();
		        result.append(this.getTypeName() + ": (");
		        result.append(this.returnStep);
		        result.append(this.returnAndReverseStep);
		        result.append(this.returnAndProceedStep);
		        result.append(this.tail);
		
		        return result.append(")").toString();
		    }
		
		@Override
		    public boolean equals(Object value) {
		        if(value == null) {
		            return false;
		        } else if(!(value instanceof __ReturnStepStack)) {
		            return false;
		        } else {
		            __ReturnStepStack md2EntityValue = (__ReturnStepStack)value;
		            boolean b= true;
		           b &= this.returnStep.equals(((__ReturnStepStack)md2EntityValue).getReturnStep()) ;
		           
		           b &= this.returnAndReverseStep.equals(((__ReturnStepStack)md2EntityValue).getReturnAndReverseStep()) ;
		           
		           b &= this.returnAndProceedStep.equals(((__ReturnStepStack)md2EntityValue).getReturnAndProceedStep()) ;
		           
		           b &= this.tail.equals(((__ReturnStepStack)md2EntityValue).getTail()) ;
		           
		
		            return b;
		        }
		    }
		}
		
