
public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal Atual: " + smartTv.canal);
		smartTv.mudarCanal(5);
		System.out.println("Canal Atual: " + smartTv.canal);

		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Canal Atual: " + smartTv.canal);
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Volume Atual: " + smartTv.volume);

		smartTv.ligar();
		System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

		smartTv.desligar();
		System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

	}
	
	

}