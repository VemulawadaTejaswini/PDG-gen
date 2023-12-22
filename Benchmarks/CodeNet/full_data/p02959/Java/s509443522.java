import java.util.*;


public class Main {
  
  private static final Map<String,Long> cache = new HashMap<String,Long>();
  
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
    long result = getResult(A, B);
    System.out.println(result);
  }
  
  private static long getResult(int[] a, int[] b) {
    int n = b.length;
    if ( a.length != n + 1 ) {
      throw new IllegalStateException("#a = " + a.length + ", #b = " + n);
    }
    if ( n == 0 ) {
      return 0;
    }
    int b0 = b[0];
    int b0min = (int)(Math.min(b0, a[0]));
    if ( n == 1 ) {
      int b01 = (int)Math.min(b0 - b0min, a[1]);
      return b0min + b01;
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
        String cacheKey = getCacheKey(aNext, bNext);
        Long cacheValue = cache.get(cacheKey);
        if ( cacheValue == null ) {
          cacheValue = getResult(aNext, bNext);
          cache.put(cacheKey, cacheValue);
        }
        long candidate = b00 + b01 + cacheValue.longValue();
      	if ( result < candidate ) {
          result = candidate;
        }
    }
    return result;
  }
  
  private static String getCacheKey(int[] a, int[] b) {
    return new StringBuilder()
      			.append(Arrays.hashCode(a))
      			.append(":")
      			.append(Arrays.hashCode(b))
      			.toString();
  }

}