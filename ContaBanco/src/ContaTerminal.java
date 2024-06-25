import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Integer numeroConta;
		String agencia;
		String nomeCliente;
		Double saldo;
		String mensagem = "";
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		try {
			System.out.println("Por favor, digite o seu Nome completo !");
			nomeCliente = scanner.nextLine();
			System.out.println("Por favor, digite o número da Agência !");
			agencia = scanner.next();
			System.out.println("Por favor, digite o número da Conta! - (Somente números)");
			numeroConta = scanner.nextInt();
			System.out.println("Por favor, digite o valor do seu Saldo!");
			saldo = Double.parseDouble(scanner.next().replace(",", "."));
			mensagem = mensagem.concat("Olá ")
					.concat(nomeCliente)
					.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
					.concat(agencia)
					.concat(", conta ")
					.concat(numeroConta.toString())
					.concat(" e seu saldo ")
//					.concat(saldo.toString())
					.concat(String.format("%.2f", saldo))
					.concat(" já está disponível para saque!");
			System.out.println(mensagem);
		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de digitar os valores corretos para cada campo.");
		} finally {
			scanner.close();
		}
	}
}