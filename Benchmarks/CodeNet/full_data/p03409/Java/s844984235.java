import java.util.Scanner;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    int[] c = new int[N];
    int[] d = new int[N];
    int[] aa = new int[N];
    int[] cc = new int[N];
    int count =0;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      aa[i] = a[i] + b[i] * 1000;
    }
    Arrays.sort(aa); //bでソートした配列、下3桁はaの情報
    for (int i =0; i<N; i++) {
      a[i] = aa[i] % 1000;
      b[i] = aa[i] / 1000;
    }
    for (int i =0; i<N; i++) {
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
      cc[i] = c[i] * 1000 + d[i];
    }
    Arrays.sort(cc);
    for (int i =0; i<N; i++) {
      c[i] = cc[i] / 1000;
      d[i] = cc[i] % 1000;
    }
    L:for (int i =0; i<N; i++) {
      for (int j =N-1; j>=0; j--) {
        if (c[i] >= a[j] && d[i] >= b[j]) {
          count++;
          a[j] = 101;
          b[j] = 101;
          continue L;
        }
      }
    }
    System.out.println(count);
  }
}    