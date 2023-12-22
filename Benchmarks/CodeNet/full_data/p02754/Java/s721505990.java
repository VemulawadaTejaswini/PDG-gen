import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
      	int x = 0, y = 0, ans = 0;
      
       if(a <= 0) {
        	System.out.println(0);
         	System.exit(0);
        }

        x = (n / (a+b)) * a;
        y = n % (a+b);
      
        ans = Math.min(y, a) + x;
      
      	System.out.println(ans);
    }
}