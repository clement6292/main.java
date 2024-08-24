import java.util.Scanner;
public class Developper extends Employee{
    private String developper;
    static Scanner scanner = new Scanner(System.in);

    public String getDevelopper(){
        return this.developper;
    }

    public String setDevelopper(String manager){
          this.developper = developper;
    }

    public void createDevelopper(){
        System.out.println("Quel language maîtrisez-vous ?");
        String developper = scanner.nextLine();
    }

      

}