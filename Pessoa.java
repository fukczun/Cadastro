package lista6;

public class PessoaQ4 {
	private String nome;
	private DataQ4 dataNasc;
	private EnderecoQ4 endereco;
	private ContatoQ4 contato;
	
	public PessoaQ4() {
		
	}
	public PessoaQ4(String nome, DataQ4 dataNasc, EnderecoQ4 endereco, ContatoQ4 contato) {
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
	public DataQ4 getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(DataQ4 dataNasc) {
		this.dataNasc = dataNasc;
	}
	public EnderecoQ4 getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoQ4 endereco) {
		this.endereco = endereco;
	}
	public ContatoQ4 getContato() {
		return contato;
	}
	public void setContato(ContatoQ4 contato) {
		this.contato = contato;
	}
}
