package lista6;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner scanTexto = new Scanner(System.in);
		Scanner scanGeral = new Scanner(System.in);
		
		System.out.print("Qual seu nome? ");
		String nome = scanTexto.nextLine();
		
		Data data = new Data();
		System.out.print("Digite o dia que você nasceu: ");
		data.setDia(scanGeral.nextInt());
		System.out.print("Digite o mês que você nasceu: ");
		data.setMes(scanGeral.nextInt());
		System.out.print("Digite o ano que você nasceu: ");
		data.setAno(scanGeral.nextInt());
		
		Endereco endereco = new Endereco();
		System.out.print("Digite o logradouro: ");
		endereco.setLogradouro(scanTexto.nextLine());
		System.out.print("Digite o número: ");
		endereco.setNumero(scanGeral.nextInt());
		System.out.print("Digite o bairro: ");
		endereco.setBairro(scanTexto.nextLine());
		System.out.print("Digite a cidade: ");
		endereco.setCidade(scanTexto.nextLine());
		System.out.print("Digite o estado: ");
		endereco.setEstado(scanTexto.nextLine());
		System.out.print("Digite o CEP: ");
		endereco.setCep(scanTexto.nextLine());
		
		Contato contato = new Contato();
		System.out.print("Digite o telefone da residência: ");
		contato.setTelefoneResid(scanTexto.nextLine());
		System.out.print("Digite o celular: ");
		contato.setCelular(scanTexto.nextLine());
		System.out.print("Digite o email: ");
		contato.setEmail(scanTexto.nextLine());
		
		Pessoa pessoa = new Pessoa(nome, data, endereco, contato);
		System.out.print("\nNome: " + pessoa.getNome() + "\n"
				+ "Data de Nascimento: " + pessoa.getDataNasc() + "\n"
				+ "Endereço: " + pessoa.getEndereco() + "\n"
				+ "Contato: " + pessoa.getContato());
	}
}
