import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[x];
    long[] b = new long[y];
    long[] c = new long[z];
    for(int i = 0; i < x; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < y; i++) {
      b[i] = sc.nextLong();
    }
    for(int i = 0; i < z; i++) {
      c[i] = sc.nextLong();
    }
    long[] ab = new long[x * y];
    for(int i = 0; i < x; i++) {
      for(int j = 0; j < y; j++) {
        ab[i * y + j] = a[i] + b[j];
      }
    }
    Arrays.sort(ab);
    long[] abc = new long[k * z];
    for(int i = x * y - 1; i >= Math.max(x * y - k, 0); i--) {
      for(int j = 0; j < z; j++) {
        abc[i * z + j] = ab[i] + c[j];
      }
    }
    Arrays.sort(abc);
    for(int i = k * z - 1; i >= k * z - k; i--) {
      System.out.println(abc[i]);
    }
  }
}