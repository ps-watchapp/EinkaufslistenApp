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
@DatabaseTable(tableName = "artikel")
		public class Artikel  implements Serializable,Md2Entity{
		
		//@SerializedName("__internalId")
		@DatabaseField(generatedId = true, columnName = "id")
		    private long id;
		    
		      protected String typeName;
		@DatabaseField(columnName = "artikel_bezeichnung")
		private String	bezeichnung;		
		@DatabaseField(columnName = "artikel_anzahl")
		private Integer	anzahl;		
		@DatabaseField(columnName = "artikel_status")
		private Integer	status;		
		
		
		
		    public Artikel() {
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
		
		public String getBezeichnung(){
				return this.bezeichnung;	
				}
				
		public void setBezeichnung(String bezeichnung ){
				this.bezeichnung=bezeichnung; 	
				}		
		public Integer getAnzahl(){
				return this.anzahl;	
				}
				
		public void setAnzahl(Integer anzahl ){
				this.anzahl=anzahl; 	
				}		
		public Integer getStatus(){
				return this.status;	
				}
				
		public void setStatus(Integer status ){
				this.status=status; 	
				}		
		
		@Override
		    public String toString() {
		        StringBuffer result = new StringBuffer();
		        result.append(this.getTypeName() + ": (");
		        result.append(this.bezeichnung);
		        result.append(this.anzahl);
		        result.append(this.status);
		
		        return result.append(")").toString();
		    }
		
		@Override
		    public boolean equals(Object value) {
		        if(value == null) {
		            return false;
		        } else if(!(value instanceof Artikel)) {
		            return false;
		        } else {
		            Artikel md2EntityValue = (Artikel)value;
		            boolean b= true;
		           b &= this.bezeichnung.equals(((Artikel)md2EntityValue).getBezeichnung()) ;
		           
		           b &= this.anzahl.equals(((Artikel)md2EntityValue).getAnzahl()) ;
		           
		           b &= this.status.equals(((Artikel)md2EntityValue).getStatus()) ;
		           
		
		            return b;
		        }
		    }
		}
		
