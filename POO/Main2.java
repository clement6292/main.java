public class Main2{
    public static void main(String[] args){
        Voiture maVoiture = new Voiture("noir","Toyota");
        System.out.println(maVoiture.getNom());
        maVoiture.setNom("Merco");
        maVoiture.accelerer();
        maVoiture.ralentir();
        maVoiture.tourner();
        maVoiture.freiner();

        
    }
}