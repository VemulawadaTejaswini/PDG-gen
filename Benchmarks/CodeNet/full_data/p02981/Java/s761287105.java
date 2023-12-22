import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
   
    int x = N * A;
    int y = B;
    
    if (x < y){                       
    	System.out.println(x);
    }else if (x > y){
    	System.out.println(y); 
    }else if (x == y){
    	System.out.println(y); 
    }
  }
}