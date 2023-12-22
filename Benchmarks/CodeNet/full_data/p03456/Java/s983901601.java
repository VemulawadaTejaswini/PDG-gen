import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String b = sc.next();
    
    String deff = a + b;
    int result = Integer.parseInt(deff);
    
    double check = Math.sqrt(result) - (int)Math.sqrt(result);
    
    if(check == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}