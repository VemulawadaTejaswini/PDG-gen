import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      	int temp = 0;
      
      	for (int i = 0; i < n; i++) {
          temp = s.nextInt();
          if (temp%2 == 0) {
            if (temp%3 != 0 && temp%5 != 0) {
              System.out.println("DENIED");
              System.exit(0);
            }
          }
        }
      	System.out.println("APPROVED");
    }
}