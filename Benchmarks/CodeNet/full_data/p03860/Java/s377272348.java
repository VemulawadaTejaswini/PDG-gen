import java.util.*;

public class Main{

  public static void main (String[] args){
    
    Scanner scanner = new Scanner (System.in);
    
    String name = scanner.nextLine();
    
    String[] nameList = name.split(" ");
    
    char initial1 = nameList[0].charAt(0);
    char initial2 = nameList[1].charAt(0);
    char initial3 = nameList[2].charAt(0);
    
    System.out.print(initial1);
    System.out.print(initial2);
    System.out.println(initial3);
  }
}