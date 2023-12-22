import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    int N;
    int[] A;
    int[] B;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[N+1];
      B = new int[N];
      for(int k = 0; k < N+1; k++) {
        A[k] = sc.nextInt();
      }
      for(int k = 0; k < N; k++ ) {
        B[k] = sc.nextInt();
      }
    }
    StringBuffer sb = null;
    long result = getResult(0, A, B, sb);
    System.out.println(result);
  }
  
  private static long getResult(long rest, int[] a, int[] b, StringBuffer sb) {
    int n = b.length;
    if ( a.length != n + 1 ) {
      throw new IllegalStateException("#a = " + a.length + ", #b = " + n);
    }
    if ( n == 0 ) {
      return rest;
    }
    int b0 = b[0];
    int b0min = (int)(Math.min(b0, a[0]));
    if ( n == 1 ) {
      int b01 = (int)Math.min(b0 - b0min, a[1]);
      return build(rest, b0min, b01, sb);
    }
    long result = -1;
    for ( int b00 = 0; b00 <= b0min; b00++ ) {
	    int[] aNext = new int[n];
    	int[] bNext = new int[n-1];
        int b01 = (int)(Math.min(b0 - b00, a[1]));
        aNext[0] = a[1] - b01;
        bNext[0] = b[1];
        for(int k = 2; k < n; k++) {
          aNext[k-1] = a[k];
          bNext[k-1] = b[k];
        }
        aNext[n-1] = a[n];
      	StringBuffer sb0 = null;//new StringBuffer(sb.toString());
        long rest0 = build(rest, b00, b01, sb0);
        long candidate = getResult(rest0, aNext, bNext, sb0);
      	if ( result < candidate ) {
          result = candidate;
        }
    }
    return result;
  }
  
  private static long build(long rest, int v1, int v2, StringBuffer sb) {
    if ( sb != null ) {
      sb.append("(").append(v1).append(",").append(v2).append(")");
    }
    return rest + v1 + v2;
  }

}