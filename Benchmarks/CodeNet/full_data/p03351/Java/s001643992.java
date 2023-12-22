import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    if(Math.abs(a-c)<=d){
      System.out.print("Yes");
      return;
    }
    if(Math.abs(a-b)<=d&&Math.abs(b-c)<=d){
      System.out.print("Yes");
      return;
    }else{
      System.out.print("No");
      return;
    }
    
    
    
  }
  

  
}