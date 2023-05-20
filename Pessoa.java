package lista6;

public class Pessoa {
	private String nome;
	private Data dataNasc;
	private Endereco endereco;
	private Contato contato;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, Data dataNasc, Endereco endereco, Contato contato) {
		this();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(DataQ4 dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoQ4 endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(ContatoQ4 contato) {
		this.contato = contato;
	}
}
