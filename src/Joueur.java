

class Joueur extends Sportif implements Comparable<Joueur>
{
	boolean blesse;
	Double qualiteDejeux;
	
	public Joueur(String nom,int cin,boolean jOn,boolean blesse)
	{
		super (nom,cin,jOn);
		this.blesse=blesse;
		this.qualiteDejeux=50.0;
	}
	 void jouerUnmatch()
	 {
		 this.qualiteDejeux+=(this.qualiteDejeux *5)/100;
	 }
	 void sentrainer()
	 {
		 this.qualiteDejeux+=(this.qualiteDejeux *2)/100;
		 
	 }
	
	public int compareTo( Joueur p) {
		if(!this.blesse)
		{
			if(p.blesse) {return(1);}
			else
			{return (int) (this.qualiteDejeux - p.qualiteDejeux);}
		}
		else {
			if(!p.blesse) {return(-1);}
			else {return (int) (this.qualiteDejeux - p.qualiteDejeux);}
			
		}
	}
	public String toString()  
	{
		return("role:Joueur"+"\n"+super.toString());
		
	}
	public void  setBlesse(boolean b) {this.blesse=b;}
	public boolean getBlesse() {return(this.blesse);}
	
	public double getQualite() {return(this.qualiteDejeux);}
	public void setQualite(double q) {this.qualiteDejeux=q;}
	 
	 
	 
	 

}
