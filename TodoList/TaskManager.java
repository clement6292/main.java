import java.util.Scanner;
import java.util.ArrayList;
// import java.io.BufferedWriter;
// import java.io.fillWritter;
// import java.io.IOException;

public class TaskManager implements TaskOperations{


  static Scanner scanner = new Scanner(System.in);

  //c'est un typage de tableau de type task
  static ArrayList<Task> taskList = new ArrayList<>();
  static TaskManager taskManager = new TaskManager();
  static int id = 1;

  // public void sauvegarder(){
  //   String tasksFil = "Tasks.txt";
  //   //Ecris dans le fichier
  //   try(BufferedWriter write=new BufferedWriter(new fileWritter(tasksFil))){
  //     writer.write(taskList.toString());
  //   }catch(IOException e){
  //     e.printStackTrace();

  //   }
  // }

  
  public static void menu (){

    while(true){
      System.out.println("------**Menu**------");
      System.out.println("Que voulez-vous faire?");
      System.out.println("1-Enregistrer  une tâche");
      System.out.println("2-Modifier une tâche");
      System.out.println("3-Afficher une Tâche");
      System.out.println("3-Afficher toutes les tâches ");
      System.out.println("5-Supprimer une tâche ");
      System.out.println("Quitter ");
      System.out.println("Choisez une option");

      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
        taskManager.addTask();
        // taskList.sauvegarder();
        break;
  
        case 2:
        taskManager.displayTask();
        break;
  
        default:
        System.out.println("choix invalide ressayer");
        
      }
    }


  }
    @Override
    public void addTask(){
      System.out.println("Entrez le tilte de la tâche");
      String title = scanner.nextLine();
      Task task = new Task(id++ , title);
      System.out.println(task.getTitle());
      taskList.add(task);
    
    };

    @Override
    public void displayTask(){
      System.out.println("liste des tâches"); 
      for(Task task : taskList){
        System.out.println(task.getTitle());
      }
    }


    public static void main (String[] args){

        taskManager.addTask();
        taskManager.menu();
    }
}