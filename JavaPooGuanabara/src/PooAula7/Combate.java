package PooAula7;

public class Combate {
	public static void main(String[]args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty men", "França", 27, 1.75f, 68.5f, 11, 2, 1);
		
		l[1] = new Lutador("PutsScrps", "Brasil", 31, 1.80f, 62.2f, 8, 3, 3);
		
		l[2] = new Lutador("Snapshadow", "Inglaterra", 29, 1.60f, 77.9f, 5, 4, 5);
		
		l[3] = new Lutador("Dead Code", "EUA", 34, 1.92f, 82.7f, 7 , 3 , 4);
		
		l[4] = new Lutador("Cobalto", "China", 37, 1.96f, 98.7f, 10, 4, 0);
		
		l[5] = new Lutador("NerfSpeed", "Colombia", 25, 2.03f, 113.6f , 12, 0, 2);
		
//		l[0].apresentar();
//		l[0].status();
//		l[3].apresentar();
//		l[4].status();
		l[2].setPeso(77.9f);
		l[2].status();
	}

}

