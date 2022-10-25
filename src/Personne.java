
 public abstract class Personne {
	protected String nom;
	protected int cin;
	public Personne(String nom ,int cin) 
	{
		this.cin=cin;
		this.nom=nom;
	}
	
	public String toString()  
	{
		return("Nom:"+this.nom+"\n"+"Cin:"+this.cin);
		
	}
	
	public boolean equals(Personne p)
	{
		return(this.cin==p.cin);
	}
	
	

}
