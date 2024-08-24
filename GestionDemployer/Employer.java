import java.util.Scanner;
import java.util.ArrayList;

public class Employer{

   private int id ;
   private String nom;
   private String poste;
   private double salaire;
   static ArrayList<Employer> Employers = new ArrayList<Employer>();
   static Scanner scan = new Scanner(System.in);
   
   
  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id = id;
  }
  
  public String getNom(){
    return this.nom;
  }
  public void setNom(String nom){
   this.nom = nom;
  }

  public String getPoste(){
    return this.poste;
  }
  public void setPoste(String poste){
    this.poste = poste;
  }

  public double getSalaire(){
    return this.salaire;
  }
  public void setSalaire(double salaire){
    this.salaire = salaire;
  }

  


 public void creatEmp(){
 Employer employer = new Employer();
   
  System.out.println("Entrez votre identifiant");
  int id = scan.nextInt();
  // employer.setId(scan.nextInt());
  scan.nextLine();

  System.out.println("Entrez votre nom");
  String nom = scan.nextLine();
  // employer.setNom(scan.nextLine());
  

  System.out.println("Entrez votre poste");
  String poste = scan.nextLine();
  // employer.setPoste(scan.nextLine());

  System.out.println("Entrez votre salaire");
  double salaire = scan.nextDouble();
  employer.setId(id);
  employer.setNom(nom);
  employer.setPoste(poste);
  employer.setSalaire(salaire);
  Employers.add(employer);
  for (Employer emp : Employers) {
      System.out.println(emp.getId());
      System.out.println(emp.getNom());
      System.out.println(emp.getPoste());
      System.out.println(emp.getSalaire());
  }
  System.out.println(Employers);


}

}