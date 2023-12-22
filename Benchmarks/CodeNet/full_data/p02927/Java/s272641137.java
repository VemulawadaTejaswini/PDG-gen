import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    int d1,d10;
    
    for(int i = 4; i <= m; i++){
    	for(int j = 22;j <= d;j++){
          d1 = j%10;
          d10 = j/10;
          if(d1*d10 == i) count++;
        }
    } 
   	
  	System.out.println(count);

  }
}
