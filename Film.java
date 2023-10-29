package ds2021;
import java.util.Scanner;

public class Film {
	protected String titre ;
	protected String realisateur ;
	protected String pays ;
	protected int duree ;
	protected int nbr ;
	
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	
	@Override public String toString() {
		return "'"+titre+"'"+" de " +"'"+ realisateur +"'"+ "( " + pays + ") - " +duree + ", nbr de places reservees =" + nbr +"  ";
	}
	
	Film(String titre, String r, String pays, int d){
		this.titre=titre;
		this.realisateur=r;
		this.pays=pays;
		this.duree=d;
	}
	
	public float totalVenteBillets () {
		float montant =0;
		Scanner e = new Scanner(System.in);
		int nbr_etu=0;
		do {
			
	        System.out.println("Quel est le nombre de places pour étudiants? ");
	        nbr_etu = e.nextInt();
		}while(nbr_etu<0 || nbr_etu>nbr);
		
        montant =nbr_etu *2;
        
        
        int nbr_pub=this.nbr - nbr_etu;
        montant+=nbr_pub *3;

       return montant;
		
	}
}





