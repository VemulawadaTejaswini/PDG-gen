import java.util.*;

public class Main{
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  String checkStr = sc.nextLine();
  
  boolean isHitachiStr = checkStr.matches(".*hi.*");
  
  System.out.println(isHitachiStr ? "Yes" : "No");
  }
}