
public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void almentarVolume() {
		volume ++;
	}
	
	public void diminuirVolume() {
		volume --;
	}
	
	public void almentarCanal() {
		if(canal < 60) {
			canal ++;
		}
	}
	
	public void diminuirCanal() {
		if(canal > 1) {
			canal --;
		}
	}
	
	public void mudarCanal(int novoCanal) {
		if(novoCanal > 0 && novoCanal < 60) {
			canal = novoCanal;
		}
	}
}
