public class Main {
	
	  @SuppressWarnings("unused")
	public static void main(String[] args) {
		  Conta conta = new Conta("123-4567", "12345"); // agencia e ContaCorrente
		  Pessoa pessoa = new Pessoa();
		  pessoa.setNome("Big pedro");
		  pessoa.setDataNascimento("12/03/2004");
		  Conta.processo();
	  }
}


