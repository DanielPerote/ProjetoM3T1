package PooAula6;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado =  false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean gettocando() {
		return tocando;
	}
	private void settocando(boolean tocando) {
		this.tocando = tocando;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
    public void ligar() {
    	this.setLigado(true);
    }
    public void desligar() {
    	this.setLigado(false);
    }
    
    public void abrirMenu() {
    	System.out.println("-------Menu-------");
    	System.out.println("Esta ligador?" + this.getLigado());
    	System.out.println("Esta tocando?" + this.gettocando());
    	System.out.print("Volume:" + this.getVolume());
    	for (int i = 0; i <= getVolume(); i +=10);
    	    System.out.println("|");
    	    System.out.println("");
    }
    
    public void fecharMenu() {
    	System.out.println("Fechando menu...");
    }
    public void maisVolume() {
    	if (this.getLigado()) {
    		this.setVolume(this.getVolume()+1);
        }	
    }
    public void menosVolume() {
    	if (this.getLigado()) {
    		this.setVolume(this.getVolume()-1);
    	}
    }
    	
    public void ligarMudo() {
    	if (this.getLigado() && this.getVolume() < 0) {
    		this.setVolume(0);
    	}
    }
    public void desligarMudo() {
    	if (this.getLigado() && this.getVolume() == 0) {
    		this.setVolume(50);
    	}
    }
    public void play() {
    	if (this.getLigado() && !(this.gettocando())){
    		this.settocando(true);
    	}
    }
    public void pause() {
    	if (this.getLigado() && (this.gettocando())) {
    		this.settocando(false);
    	}
    }
    	
}  