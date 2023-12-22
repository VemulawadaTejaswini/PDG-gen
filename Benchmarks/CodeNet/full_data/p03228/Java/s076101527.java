import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    int k = sc.nextInt();
    
    long stack;
   	
    for(int i = 0; i < k;i++){
    	if(i%2 == 0){
        	a /= 2;
          	b += a;
        } else {
          	b /= 2;
          	a += b;
        }
    }
    
  	System.out.println(a + " " + b);

  }
}
