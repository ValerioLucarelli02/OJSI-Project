package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Caffe")
public class Caffetteria {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "caffeID")
	private Integer Id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String codice;
	@Column
	private Integer quantita;
	@Column
	private Integer moltiplicatore;
	public Caffetteria() {
		super();
	}
	public Caffetteria(Integer ID,String nome, String cognome, String codice, Integer quantita, Integer moltiplicatore) {
		super();
		this.Id = ID;
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.quantita = quantita;
		this.moltiplicatore = moltiplicatore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getMoltiplicatore() {
		return moltiplicatore;
	}
	public void setMoltiplicatore(Integer moltiplicatore) {
		this.moltiplicatore = moltiplicatore;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	

}
