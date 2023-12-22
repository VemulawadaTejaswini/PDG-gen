import java.util.*;

public class Main{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int value = 700;
    
    if (S.substring(0, 1) == "o"){
      value += 100;
    }
   
    if (S.substring(0, 2) == "o"){
      value += 100;
    }
    
    if (S.substring(0, 3) == "o"){
      value += 100;
    }
    
    System.out.println(value);
    
  }
}