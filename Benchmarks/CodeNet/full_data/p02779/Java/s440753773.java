import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
    }
    scan.close();

    Arrays.sort(A);

    for(int i=0; i<N-1; i++) {
      if(A[i] == A[i+1]) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}