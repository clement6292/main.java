import java.util.Scanner;
// import java.util.ArrayList;


public class Employee{

  private int id;
  private String nom;
  private String poste;
  private double salaire;

  static Scanner scanner = new Scanner(System.in);

  
 
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

  public void createEmployee(){
    

    // Employee employee = new Employee(); 

  System.out.println("Entrez votre indentifiant");
  int id = scanner.nextInt();
  scanner.nextLine();

  System.out.println("Entrez votre nom");
  String nom = scanner.nextLine();

  System.out.println("Entrez votre poste");
  String poste = scanner.nextLine();


  System.out.println("Entrez votre salaire");
  double salaire = scanner.nextDouble();
  


  }
  }



