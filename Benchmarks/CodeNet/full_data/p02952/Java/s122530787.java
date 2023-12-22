import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      if (n < 100) {
      	if (n >= 10) {
          System.out.print(9);
        } else {
        	System.out.print(n);
        }
      } else if (n < 10000) {
        if (n >= 1000) {
          System.out.print(909);
        } else {
        	n -= 90;
        	System.out.print(n);
        }
      } else {
        if (n >= 100000) {
          System.out.print(90909);
        } else {
        	n -= 9090;
        	System.out.print(n);
        }
      }
      
    }
}