
public class Pessoa {

	public static String nome; // armazena o nome referente a conta
	public static String dataNascimento; // armazena a data de nascimento referente a pesoa
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Pessoa.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		Pessoa.dataNascimento = dataNascimento;
	}
	 //getter e setter do nome e data nascimento da pessoa
	
	public String toString() { // printa o nome e a data de nascimento
		return "\n\nNome: " + nome + "\nData de nascimento: " + dataNascimento;
	}

	
	
}
