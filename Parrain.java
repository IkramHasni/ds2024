package ds2024;

public class Parrain extends Personne {
         int idParrain;
         static int comp=0;
         private int nb=0;
         int max=100;
        public Enfant [] MesEnfants;
        public Parrain (String nom,String prenom,int age) {
        	super(nom,prenom,age);
        	comp++;
        	idParrain=comp;
        	MesEnfants =new Enfant[max];
        }
	   public void ajouterEnfant(Enfant Enfant) {
		   if(nb<max) {
			   MesEnfants[nb]=Enfant;
			   nb++;
		   }
		   else {
			   System.out.println("impossible dajouter");
		   }
	   }
	   public  void afficheInfos() {
		   super.afficheInfos();
		   System.out.println("idParrain= "+idParrain+"nb d'enfant= "+nb);
		   for(int i=0;i<nb;i++) {
			   MesEnfants[i].afficheInfos();
		   }
	   }
	   
	   public int getnbreEnfantsParraines() {
		     return nb;
	   }
	   
	
}
