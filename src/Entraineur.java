import java.util.Collections;
import java.util.List;



class Entraineur extends Sportif implements Selectionneur
{	
  public   Entraineur(String nom ,int cin ,boolean j)
  {
	  super(nom,cin,j);
  }
  
  
  
  void entrainer(List<Joueur> collectionsDesjoueur)
  {
	  for (Joueur i: collectionsDesjoueur)
	  {
		  i.sentrainer();
	  }
  }
      public     List<Joueur> selectionner ( List<Joueur> listeDesjoueurs)
  {
	  Collections.sort(listeDesjoueurs);
	  Collections.reverse(listeDesjoueurs);
	  return (listeDesjoueurs.subList(0, 11));
	  
  }
  public String toString()  
	{
		return("role:Entraineur"+super.toString());
		
	}

}
