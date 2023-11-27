package Aula5;

public class testeAula5 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setnumConta(1221);
		p1.setDono("Jubis");
		p1.abrirConta("CC");
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setnumConta(2112);
		p2.setDono("Maraiua");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
