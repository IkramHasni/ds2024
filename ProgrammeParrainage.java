package ds2024;

public class ProgrammeParrainage {
	public static void main(String[] args) {
// Création des parrains
		Parrain[] parrains = new Parrain[10];
		parrains[0] = new Parrain("Ali", "Ben Ali", 40);
		parrains[1] = new Parrain("Salah", "Ben Salah", 35);
		parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 100.0);

 // Création des enfants
		Enfant[] enfants = new Enfant[1025];
		enfants[0] = new Enfant("Farah", "ben Farah", 10, " quatrième année ");
		enfants[1] = new Enfant("Amel", "ben Amel", 12, "Sixième année");
		enfants[2] = new Enfant("Fedy", "Ben Fedy", 11, "Sixième année");
		enfants[3] = new Enfant("Sarra", "Ben Sarra", 9, "Troisième année");
// Parrainage des enfants
		parrains[0].ajouterEnfant(enfants[0]);
 // (a) Ali ben Ali parraine Farah
 // (b) Tounes ben Tounes parraine Amel et Fedy
		parrains[2].ajouterEnfant(enfants[1]);
		parrains[2].ajouterEnfant(enfants[2]);
 //( c )Affichage du nombre total d'enfants parrainés
		for (int i=0;i<parrains.length;i++) {
		  if(parrains[i]!=null) {
		   System.out.println("nb enfant de "+i+" = "+parrains[i].getnbreEnfantsParraines());
		  }
		 }
		
 // (d ) Affichage des enfants parrainés en "Sixième année"
		// (d) Afficher les enfants en Sixième année
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < parrains[i].getnbreEnfantsParraines(); j++) {
		        if (parrains[i].MesEnfants[j].getClasse().equals("Sixième année")) {
		            parrains[i].MesEnfants[j].afficheInfos();
		        }
		    }
		}
// ( e) Affichage du montant total des virements mensuels pour tous //les parrains mensuels
		double total=0;
		for (int i=0;i<3;i++) {
			if(parrains[i] instanceof ParrainMensuel) {
			   total=total + ((ParrainMensuel) parrains[i]).calculerVirementTotal();
		}
		}
	    System.out.println(total);
		
}
}