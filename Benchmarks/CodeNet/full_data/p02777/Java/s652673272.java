import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    String u = sc.next();
    
   
    if(s.equals(u)){
      a = a - 1;
    }else if(t.equals(u)){
      b = b - 1;
    }
    
    System.out.println(a + " " + b);
    
    sc.close();
    
  }
}
