import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);

    long N = sc.nextLong();
    long M = sc.nextLong();
    long count = 0;
    
    for(long i = 0; i < N; i++) {
        if(0 <= N - M) {
            count++;
            N = N - M;
        }else {
            break;
        }
    }
    if(0 < count) {
        System.out.println(count);
    }else {
        System.out.println(N);
    }
    
  }
}
