//imoportation de l'interphase List

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Mylist{
    public static void main(String[] args){
//Exo1: Trier un tableau d'entiers
//         creation d'un Array list
    //     int[] number = {5, 2, 9, 1, 5, 6};
    //     Arrays.sort(number);
    //     for(int i : number){
    //     System.out.println(i);
    //   } 
    //   System.out.println(Arrays.toString(number));


    //Exo2: Filtrer les éléments pairs d'un tableau
    //   int [] number ={1, 2, 3, 4, 5, 6};
    //   for(int i=0;i<=number.length;i++){
    //   if(number[i] % 2 == 0){
    //   System.out.println(number[i]);
    //   } 
    //   }

    //Exo3:Trouver le maximum et le minimum d'un tableau
    // int[] number ={3, 5, 7, 2, 8};
    //     Arrays.sort(number);
    //     for(int i : number){
    //         System.out.println(i);
           
            
    //     }  
    //      System.out.println("min : " + number[0]);
    //      System.out.println("max : " + number[number.length-1]);

    
    //Exo 4:Rechercher un élément dans un tableau trié
    // int[] number ={3, 1, 5, 9, 7};
    // Scanner Scanner =new Scanner(System.in);
    // System.out.println("Entrer le nombre");
    // int nombre = Scanner.nextInt();
    // int index = Arrays.binarySearch(number,nombre);
    // String resultat =(index<0)?" le nomnbre n'existe pas dans le tableau ":" le nombre " + nombre +" est à la position " + index;
    // System.out.println(resultat);
    // Scanner.close;


    //Exo5:Supprimer les doublons d'un tableau
    int[] doublons={1, 2, 2, 3, 4, 4, 5};
    Set<Integer> uniqueVal = new HashSet<>();
    for(int item : doublons){
        uniqueVal.add(item);
    }
    // System.out.println(doublons);
    System.out.println("le tableau des valeurs unique est " + uniqueVal);
   
    }
}



