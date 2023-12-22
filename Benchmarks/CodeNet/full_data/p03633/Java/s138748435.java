import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] T = new long[n];
    for(int x = 0; x < n; x++) {
      T[x] = sc.nextLong();
    }
    if( n == 1) {
      System.out.println(T[0]);
      return;
    }
    Arrays.sort(T);
    int i = 1;
    long MAX = 1000000000000000001L;
    while(T[n-1]*i < MAX) {
      for(int j = 0; j<n-1; j++) {
        if((T[n-1]*i) % T[j] != 0)break;
        if(j == n-2){
          System.out.println(T[n-1]*i);
          return;
        }
      }
      i++;
    }
  }
}
