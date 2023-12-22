import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];

      for(int i = 0; i < n; i++) a[i] = sc.nextInt();
      for(int i = 0; i < n; i++) b[i] = sc.nextInt();
      for(int i = 0; i < n; i++) c[i] = sc.nextInt();

      Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);

      long[] conBC = new long[n];
      for(int i = 0, j = 0; i < n && j < n; i++) {
          int numB = b[i];
          while(j < n && c[j] <= numB)
              j++;
          conBC[i] = n - j;
      }

      long[] conAB = new long[n];
      for(int i = 0, j = 0; i < n && j < n; i++) {
          int numB = b[i];
          while(j < n && a[j] < numB)
              j++;
          conAB[i] = j;
      }
      long cnt = 0;
      for(int i = 0; i < n; i++)
        cnt += (long)conAB[i]  * (long)conBC[i] ;
      System.out.println(cnt);
  }
}

