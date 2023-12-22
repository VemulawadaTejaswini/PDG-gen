import java.util.Scanner;

public class Main {
 public static void main (String[ ] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String s = sc.next();
  char[] ch = s.toCharArray();
  int[] x = new int[n];

  for (int i = 0; i < n; i++) {
   if (ch[i] == 'I') {
    x[i] = 1;
   } else if (ch[i] == 'D') {
    x[i] = -1;
   }
 }

  int m = 0;
  for (int i = 1; i < n; i++) {
   x[i] += x[i - 1];
   m = Math.max(m, x[i]);
  }

  System.out.println(m);

 }
}
