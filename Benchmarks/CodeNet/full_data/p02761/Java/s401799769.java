import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];
    for(int i=0; i<M; i++) {
      s[i] = scan.nextInt();
      c[i] = scan.nextInt();
    }
    scan.close();

    int min = (int)Math.pow(10, N-1);
    int max = (int)Math.pow(10, N) - 1;
    for(int i=min; i<=max; i++) {
      boolean test = true;
      for(int j=0; j<M; j++) {
        if((i % (int)Math.pow(10, N-s[j]+1)) / (int)Math.pow(10, N-s[j]) != c[j]) {
          test = false;
        }
      }
      if(test == true) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}