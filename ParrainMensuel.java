package ds2024;

public class ParrainMensuel extends Parrain{
       private double virementMensuel;
       public ParrainMensuel (String nom,String prenom,int age,double virementMensuel) {
    	   super(nom,prenom,age);
    	   this.virementMensuel=virementMensuel;
       }
       public double  calculerVirementTotal() {
    	   return super.getnbreEnfantsParraines() * virementMensuel;
       }
       public double getvirementMensuel() {
    	   return virementMensuel;
       }
       public void afficheInfos() {
    	   super.afficheInfos();
    	   System.out.println("total= "+calculerVirementTotal());
       }
}
