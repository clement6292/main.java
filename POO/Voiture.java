public class Voiture{
    private String nom = "Audi";


   public String getNom(){
     return this.nom;
   }

   public void setNom(String nom){
      this.nom= nom;
   }

     int modele = 2020;
     int prix = 750000;
     String couleur;

     public Voiture(){
      System.out.println("ma classe est instanciée");
     }
     public Voiture(String couleur,String nom){
      this.nom = nom;
      this.couleur = couleur;
      System.out.println(couleur);
     }

     public void accelerer(){
        System.out.println("J'accelère");
     }

     public void ralentir(){
        System.out.println("Je ralenti"); 
     }

     public void tourner(){
        System.out.println("Je tourne"); 
     }

     public void freiner(){
        System.out.println("Je freine"); 
     }



     
}