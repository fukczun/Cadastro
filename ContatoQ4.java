package lista6;

public class ContatoQ4 {
	private String telefoneResid;
	private String celular;
	private String email;
	
	public String getTelefoneResid() {
		return telefoneResid;
	}
	public void setTelefoneResid(String telefoneResid) {
		this.telefoneResid = telefoneResid;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\n    Telefone Residencial: " + telefoneResid + "\n"
				+ "    Celular: " + celular + "\n"
				+ "    E-mail: " + email;
	}
	
}
