package ds2021;

public class Documentaire extends Film {
	private String sujet;
	private final float tarif=2f;
	
	Documentaire (String titre, String r, String pays, int d,String sujet){
		super(titre,r,pays,d);
		this.sujet=sujet;
	}

	@Override
	public String toString() {
		return (super.toString()+ this.getClass().getSimpleName()+"[ sujet = '" + sujet +"', tarif=" + tarif + "]");
	}
	
	public float totalVenteBillets () {
		float montant = this.nbr*tarif;
		return montant;
	}

}
