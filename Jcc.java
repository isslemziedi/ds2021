package ds2021;

public class Jcc {
	private Film tab_Comp [];
	private int annee;
	private final int NBFMAX=30;
	private int nbF=0;
	
	
	Jcc(int taille,int annee){
		tab_Comp = new Film[taille];
	}
	
	public void ajoutFilm (Film f) {
		if(nbF< NBFMAX) {
			tab_Comp[nbF]=f;
			nbF++;
		}
		else {
			System.out.println("La competition est au complet");
		}
	}
	
	public void listeFilmsJCC() {
		for(int i=0;i<tab_Comp.length;i++) {
			if(tab_Comp[i]!=null) {
				System.out.println(tab_Comp[i].toString());
			}
		}
	}
	
	double totalVenteBilletsJCC() {
		double total=0;
		for(int i =0;i<tab_Comp.length;i++) {
			if(tab_Comp[i] != null) {
				total=total+tab_Comp[i].totalVenteBillets(); 
			}
		} 
		return total;
	}
}


