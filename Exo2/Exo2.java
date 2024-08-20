
public class Exo2{
public static void main(String[] args){

// Exo1
int X = 35;
String z=(X % 2 == 0)?" le nombre "+ X +" est paire ":" le nombre "+ X +" est impaire ";
System.out.println(z);




// Exo 2
int x = 1;
int y = 5;
int z = 20;
if((x>y) && (x>z)){
    System.out.println("le plus grand nombre est" +  x ); 
}else if((y>x) && (y>z)){
  System.out.println("le plus grand nombre est" +  y );
  }else if((z>x) && (z>y)){
 System.out.println("le plus grand nombre est" +  z );
}else{
    System.out.println("deux ou trois d'entres les nombres sont egaux");
}
  


  //Exo 3

  int age = 5;
 if(0<=age && age<=12){
System.out.println("Enfant");
  }else if(13<=age && age<=19){
System.out.println("Adolescent");
  }else if(20<=age && age<=64){
System.out.println("Adulte");
  }else{
System.out.println("Senior");
  }

//Exo 4
int note =25;
String z =(note>=50)?"Echoué":"Reussi";
System.out.println(z);

//Exo 5

int montant = 500;
int remise =0;
if(montant>500){
  remise = (montant*20)/100;
  montant = montant-remise;
  System.out.println(montant);
}else if(montant>=100){
remise = (montant*10)/100;
montant=montant-remise;
System.out.println(montant);
}else{
System.out.println(montant);
}


}    
}


