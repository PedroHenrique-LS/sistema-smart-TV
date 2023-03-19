
public class Usuario {
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.almentarVolume();
		
		smartTv.almentarCanal();
		
		smartTv.mudarCanal(61);
		
		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal: " + smartTv.canal);
		System.out.println("Volume: " + smartTv.volume);	
		
		smartTv.ligar();
		
		System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
	}
}
