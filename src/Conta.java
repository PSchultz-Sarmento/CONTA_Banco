import java.util.Scanner;

public class Conta {
	
	String agencia; // mais tarde sera referente ao numero da agencia
	String contaCorrente; // mais tarde sera referente ao numero da Conta COrrente
	static double saldo = 1000; // saldo inicial
	Scanner scan = new Scanner(System.in);
	
	@SuppressWarnings("resource")
	public static void processo() { // exibe as 4 opera��es possiveis na conta
		  Scanner scan = new Scanner(System.in);
		  Conta conta = new Conta("123-4567", "12345"); // agencia e ContaCorrente
		  System.out.println("Digite o n�mero da sua opera��o");
		  System.out.println("1 - Consultar Saldo\n"
		  				+ "2 - Extrato\n"
		  				+ "3 - Saque\n"
		  				+ "4 - Deposito\n"); // as 4 opera��es
		  int operacao = scan.nextInt();
		  
		  if (operacao == 1) { // numero da opera��o
			  conta.consultarSaldo(); //nome da opera��o
			  loop();
		  }
		  else if (operacao == 2) {
			  conta.consultarExtrato();
			  loop();
		  }
		  else if (operacao == 3) {
			  conta.Saque(saldo);
			  loop();
		  }
		  else if (operacao == 4) {
			  conta.Deposito(saldo);
			  loop();
		  }
		  }
	
	@SuppressWarnings("resource")
	public static void loop() { // no final da opera��o, voce escolhe se vai fazer outra opera��o ou n�o
		  Scanner scan = new Scanner(System.in);
		  System.out.println("\nDeseja fazer outra opera��o? S/N");
		  String SN = scan.next(); // variavel SIM ou N�O, nome bem tosco
		  System.out.println(SN);
		  if (SN.equals("S") || SN.equals("s")) {
			  System.out.println("\n");
			  Conta.processo();
		  }
		  else if (SN.equals("N") ||SN.equals("n")) {
			  try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  return;
		  }
	  
}
	

	public Conta (String agencia, String contaCorrente) {
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
	}
	
	
	@SuppressWarnings("static-access")
	public double consultarSaldo() { //opera��es listadas anteriormente
		System.out.println("Seu saldo � de: R$" + this.saldo);
		return saldo;
				}
	
	
	public String consultarExtrato() {//opera��es listadas anteriormente
		System.out.println("Extrato: \n\n" + 
	"Agencia: " + agencia + "\n\n" + 
	"Conta corrente: " + contaCorrente + "\n\n" +
	"Nome: " + Pessoa.nome + "\n\n" +
	"Data de nascimento: " + Pessoa.dataNascimento + "\n\n" +
	"Saldo: " + saldo);
		return agencia;
	}
	
	@SuppressWarnings("static-access")
	public double Saque(double valor) {//opera��es listadas anteriormente
		  System.out.println("Valor do saque: ");
		  double saque = scan.nextDouble();
		  
		if ( saldo > saque) {//opera��es listadas anteriormente
			saldo -= saque;
			System.out.println("Novo saldo: " + this.saldo);
		}
		else {
			System.out.println("Saldo Insuficiente, seu saldo permanece em R$ " + saldo);
		}
		return saldo;
		
	}
	@SuppressWarnings("static-access")
	public double Deposito(double valor) {//opera��es listadas anteriormente
		System.out.println("Valor do Deposito: ");
		  double deposito = scan.nextDouble();
		  this.saldo += deposito;
		  System.out.println("Novo saldo: R$" + this.saldo);
		  return saldo;
	}
}
