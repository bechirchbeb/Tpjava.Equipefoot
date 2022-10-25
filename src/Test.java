
public class Test {

	public static void main(String[] args) {
		Personne p1=new Joueur("bechir",1,false,false);
		Joueur j1=(Joueur) p1;
		
	 //test joueur
		System.out.print(j1.toString());
		System.out.print("\n");
		System.out.print(j1.getQualite());
		j1.jouerUnmatch();                        //jouer un match
		System.out.print("\n");
		System.out.print(j1.getQualite());
		System.out.print("\n");
		
	}

}
