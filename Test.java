package ds2021;

public class Test {

	public static void main(String[] args) {
		Jcc j = new Jcc(2,2021);
		
		Documentaire D = new Documentaire(" Le dernier refuge "," Ousman "," Mali ",86,"La guerre civile");
		 D.setNbr(30);
		 Film F = new Film("Insurrection","Jilani Saadi","Tunisie",105);
		 F.setNbr(45);	
		 
		 j.ajoutFilm(D);
		 j.ajoutFilm(F);
		 
		 j.listeFilmsJCC();
		 System.out.println("Pour le Film 1 : ");
		 D.totalVenteBillets();
		 
		 F.totalVenteBillets();
		 System.out.println("Pour le Film 2 : ");
		 double montantTotalVentes = j.totalVenteBilletsJCC();
		 System.out.println("le montant des ventes de billets pour les JCC : " + montantTotalVentes + " €");
	}
}
