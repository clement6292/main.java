import java.util.Scanner;

public class Manager extends Employee{
    static Scanner scanner = new Scanner;
     
    private String manager;

    public String getManager(){
        return this.manager
    }

    public String setManager(String manager){
          this.manager = manager;
    }

    public void createManager(){
     System.out.println("Combien de developpeurs surpervisez-vous ?");
     String manager=scanner.nextLine();
    }

      } 


     