package programa;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
//	public Pessoa(String nome, int idade, double altura) {
//		this.nome = nome;
//		this.idade = idade;
//		this.altura = altura;
//	}
	
	public void armazenaPessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
