import java.util.ArrayList;
import java.util.List;
class Equipe {
	String nomE;
	List<Personne> lespersonnes=new ArrayList<Personne>();
	
	public Equipe(String nom)
	{
		this.nomE=nom;
		
	}
    
	void ajouterPersonne(Personne p)
	{
		if(!lespersonnes.contains(p))
		{
			lespersonnes.add(p);
		}
	}
	void supprimerPersonne(Personne p)
	{
		for(int i=0;i<this.lespersonnes.size();i++)
		{
			if (lespersonnes.get(i).equals(p))
			{
				lespersonnes.remove(i);
			}
		
			
			
		}
	}
}
