import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		//os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome2 = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome2 = scanner.next();

        System.out.println("Digite sua idade");
        int idade2 = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura2 = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome2 + " " + sobrenome2);
        System.out.println("Tenho " + idade2 + " anos ");
        System.out.println("Minha altura é " + altura2 + "cm ");

	}

}
