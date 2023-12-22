import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();
      int[] ax = new int[n];
      
      int offset=0,next=0;
      char regex = ' ';
      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regex,offset)) == -1)
          next = line.length();
        ax[i] = Integer.parseInt(line.substring(offset, next));
        offset = ++next;
      }

      long val = ax[0];
      for(int i=1; i<n; i++) {
        val = lcm(val,ax[i]);
      }
      val--;
      long ans = 0;
      for (int i : ax) {
        ans += val % (long)i;
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  public static long lcm(long m, long n) {
    return m * n / gcd(m, n);
  }
  
  public static long gcd(long x, long y) {
    if( x<y ) {
      long tmp = x; x = y; y = tmp;
    }
    return gcdTailRec(x, y).invoke();
  }

  private static TailCall<Long> gcdTailRec(
    final long x, final long y) {
      if( (x%y) == 0 ) return TailCalls.done(y);
      else return TailCalls.call(
        () -> gcdTailRec(y, x%y) );
    }
}


interface TailCall<T> {

  TailCall<T> apply();

  default boolean isComplete() { return false; }

  default T result() { throw new Error("not implemented."); }

  default T invoke() {
    return Stream.iterate(this, TailCall::apply)
      .filter(TailCall::isComplete)
      .findFirst()
      .get()
      .result();
  }
}

class TailCalls {

  public static <T> TailCall<T> call(final TailCall<T> nextCall) {
    return nextCall;
  }

  public static <T> TailCall<T> done(final T value) {
    return new TailCall<T>() {
      @Override public boolean isComplete() { return true; }
      @Override public T result() { return value; }
      @Override public TailCall<T> apply() {
        throw new Error("not implemented.");
      }
    };
  }
}