import java.util.*;
public class Main{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    int a = new sc.nextInt();
    int b = new sc.nextInt();
    String x = new sc.nextLine();
    String c = new sc.nextLine();
    
    if(b == 0){
    System.out.println(c.substring(0,1).toLowerCase() + c.substring(1));
    }else if(b < a){
     System.out.println(c.substring(0,b) + c.substring(b,b+1).toLowerCase() + c.subString(b+1)); 
    }else{
      System.out.println(c.substring(0,b) + c.subString(b).toLowerCase());
    }
  }
}