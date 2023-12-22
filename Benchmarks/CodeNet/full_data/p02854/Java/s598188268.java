import java.util.Scanner;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    
    long[] A = new long[N];
    long sum = 0;
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
      sum += A[i];
    }
    scan.close();

    long left=0, right=0, diff=0, res=2020202021;
    for(int i=0; i<N; i++) {
      left += A[i];
      right = sum - left;
      diff = Math.abs(left - right);
      if(diff < res) res = diff;
    }
    System.out.println(res);
  }
}
