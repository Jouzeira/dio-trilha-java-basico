// Cen�rio 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recupera��o" : "Reprovado";
		System.out.println(resultado);
	}
}
