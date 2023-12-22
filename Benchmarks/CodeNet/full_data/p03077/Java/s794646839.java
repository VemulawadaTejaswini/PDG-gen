import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long[] a = new long[5];
    for(int i = 0; i < 5; i++ ){
      a[i] = sc.nextLong();
    }
    Main abc123C = new Main();
    System.out.println(abc123C.solve(n, a));
  }

  public long solve(long n, long[] a) {
    long min = a[0];
    for(int i = 1; i < 5; i++ ) {
      if(a[i] < min){
        min = a[i];
      }
    }
    return (long)Math.ceil((double)n/min) + 4;
  }
}
