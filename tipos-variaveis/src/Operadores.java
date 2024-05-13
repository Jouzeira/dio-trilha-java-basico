
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String concatenacao = "?";
		System.out.println(concatenacao);
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);

		int numero = 5;
		numero = - numero;
		System.out.println(numero);
		numero = - numero;
		System.out.println(numero);
		
		System.out.println(numero++);
		System.out.println(++numero);
		
		System.out.println(numero--);
		System.out.println(--numero);
		
		int a, b;
		a = 5;
		b = 6;
		
		String resultado = a == b ?"verdadeira":"falso";
		System.out.println(resultado);
		
		
		a = 6;
		b = 6;
		
		resultado = a == b ?"verdadeira":"falso";
		System.out.println(resultado);
		
	}

}
