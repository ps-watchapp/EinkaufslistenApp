package Einkaufszettel.backend.entities.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Artikel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	@Column(name="INTERNAL_ID__")
	@XmlElement
	protected int __internalId;
	
	@NotNull
	@XmlElement(nillable=true)
	protected String bezeichnung;
	
	@NotNull
	@XmlElement(nillable=true)
	protected int anzahl;
	
	@NotNull
	@XmlElement(nillable=true)
	protected int status;
	
	
	///////////////////////////////////////
	/// Getters and setters
	///////////////////////////////////////
	
	public int get__internalId() {
		return __internalId;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
