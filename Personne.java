package ds2024;

public class Personne {
     private String nom;
     private String prenom;
     private int age;
     public Personne() {
    	 nom="";
    	 prenom="";
    	 age=1;
     }
     public Personne(String nom,String prenom,int age) {
    	 this.nom=nom;
    	 this.prenom=prenom;
    	 this.age=age;
     }
     public  void afficheInfos() {
    	 System.out.println("nom= "+nom+" prenom= "+prenom+"age= "+age);
     }
     public void setAge(int age) {
    	 if(age>0) {
    	 this.age=age;
     }
    	 else {
    		 System.out.println("age negative");
    	 }
     
      }
}
