import java.util.*;

public class Main {

  static int N;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    
    for (int i = 0; i < N; i++) {
      C[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(A);
    Arrays.sort(C);

    long count = 0;

    for (int i = 0; i < N; i++) {
      count += binary_search(A, B[i]) * (N - binary_search(C, B[i] + 1));
    }

    System.out.println(count);

  }

  public static long binary_search(int[] a, int x) {

	int l = -1;
	int r = N;
    
    while(r - l > 1) {

	  int i = (l + r) / 2;
      
      if(x <= a[i]) {
        r = i;
      } else {
        l = i;
      }

	}
	return r;
  }

}