package model.dto;

public class CaffetteriaDto {

	private String nome;
	private String cognome;
	private String codice;
	private Integer quantita;
	private Integer moltiplicatore;
	public CaffetteriaDto() {
		super();
	}
	public CaffetteriaDto(String nome, String cognome, String codice, Integer quantita, Integer moltiplicatore) {
		super();
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
	
	
}
