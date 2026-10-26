package ds2024;

public class Enfant extends Personne {
	  private static int comp=0;
      private int idEnfant;
      private String classe;
      public Enfant(String nom, String prenom, int age, String classe) {
          this(nom, prenom, age);
          this.classe = classe;
       }
      public Enfant (String nom,String prenom,int age) {
    	  super(nom,prenom,age);
    	  comp++;
    	  idEnfant=comp;
      }
      public  void afficheInfos() {
    	  super.afficheInfos();
    	  System.out.println("id= "+idEnfant+" classe= "+classe);
      }
      public String getClasse() {
    	  return classe;
      }
}
