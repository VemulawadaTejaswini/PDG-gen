import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
    	int a,b,c;
    
    	Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    
    	c = a*b;
    
    	if(c % 2 == 0) System.out.println("Even");
    	else System.out.println("Odd");
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}