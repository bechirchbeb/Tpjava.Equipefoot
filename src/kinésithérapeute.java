
class Kinésithérapeute  extends Personnelmedical
{
	public Kinésithérapeute(String nom,int cin,String Dipl)
	{
		super(nom,cin,Dipl);
	}
	void masser(Joueur j)
	{
		if(!j.blesse) {
		
		}
	}
	public String toString()  
	{
		return("Nom:"+this.nom+"Cin:"+this.cin+"role:Kiné");
		
	}
	
}
