import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner file = new Scanner(System.in);
  int n = file.nextInt();
  int m = file.nextInt();
  int[][] a = new int[m][];
  for (int i = 0; i < m; i++) {
   int k = file.nextInt();
   a[i] = new int[k];
   for (int j = 0; j < k; j++) {
    a[i][j] = file.nextInt() - 1; 
   }
  }
  int[] b = new int[n];
  for (int i = 0; i < n; i++) b[i] = file.nextInt();
  int tot = 0;
  for (int i = 0; i < (1 << n); i++) {
   int count = 0;
   int[] c = new int[n];
   for (int j = 0; j < (1 << n); j <<= 1) {
    if (j & i > 0) c[(int) (Math.log(j) / Math.log(2))] = 1; 
   }
   int[] d = new int[m];
   for (int j = 0; j < m; j++) {
    int t = 0;
    for (int k = 0; k < a[j].length; k++) {
     if (c[a[j][k]] == 1) t++; 
    }
    t %= 2;
    if (t == b[j]) count++;
   }
   if (count == m) tot++;
  }
  System.out.println(tot);
  file.close();
  System.exit(0);
 }
}