import java.util.*;

public class Main{
  public Main(){}
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] tokens = scanner.nextLine().split(" +");
    
    System.out.println("A" + tokens[1].charAt(0) + "C");
  }
}