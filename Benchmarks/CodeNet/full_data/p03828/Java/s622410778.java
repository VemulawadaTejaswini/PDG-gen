import java.util.Scanner;

public class Main {
 public static void main (String[ ] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  long[] a = new long[n];
  long k = 1;
  long count = 0;
  
  for (int i = 0; i < n; i++) {
   a[i] = n - i;
   k *= a[i];
  }

  for (int i = 1; i <= k; i++) {
   if(k % i == 0) {
    count++;
   }
  }

  System.out.println(count % (int)(Math.pow(10, 9) + 7));

  
 }
}
