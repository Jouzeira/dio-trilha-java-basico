
public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTV smartTV = new SmartTV();
		System.out.println("TV Ligada ? " + smartTV.ligada);
		System.out.println("Canal Atual : " + smartTV.canal);
		System.out.println("Volume Atual : " + smartTV.volume);
		
		smartTV.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTV.ligada);
		smartTV.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTV.ligada);
		smartTV.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTV.ligada);
		smartTV.aumentarVolume();
		smartTV.aumentarVolume();
		smartTV.aumentarVolume();
		smartTV.aumentarVolume();
		smartTV.diminuirVolume();
		System.out.println("Volume Atual : " + smartTV.volume);
		smartTV.aumentarCanal();
		System.out.println("Canal Atual : " + smartTV.canal);
		smartTV.diminuirCanal();
		System.out.println("Canal Atual : " + smartTV.canal);
		smartTV.mudarCanal(10);
		System.out.println("Canal Atual : " + smartTV.canal);
		
		

	}

}
