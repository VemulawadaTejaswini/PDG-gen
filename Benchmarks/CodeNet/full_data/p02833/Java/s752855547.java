import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
      	long result = 0;
      	boolean flag = true;
      	double temp = 10;
      	if(n%2 == 1 || n < 10) System.out.println(0);
      	else {
      	  n = n/10 * 10;
          while(n / temp > 1) {
            result += (long)(n / temp);
            if(flag) temp *= 5;
            else temp *= 2;
          }
        }
      	System.out.println(result);
    }
}
 