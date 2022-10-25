import java.util.ArrayList;
import java.util.List;

public class Medcin extends  Personnelmedical implements Selectionneur
{
	
	public Medcin(String n,int c,String d)
	{
		super(n,c,d);
	}

	void masser(Joueur j)
	{
		if(!j.getBlesse()) {
		j.setQualite(j.getQualite() /100);
		}
	}
	void soigner(Joueur j)
	{ 
		if(j.getBlesse())
		{
			j.setBlesse(false);
		}
	}
	 public List<Joueur> selectionner( List<Joueur> listeDesjoueurs)
	{
		 List<Joueur> L =new ArrayList<Joueur>(11);
		for(int i=0;i<listeDesjoueurs.size();i++)
		{
		
			if( !listeDesjoueurs.get(i).blesse) { L.add(listeDesjoueurs.get(i));}
			
		}
		return(L);
	}
	 public String toString()  
		{
			return("role:Medcin"+super.toString());
			
		}
	
	

}
