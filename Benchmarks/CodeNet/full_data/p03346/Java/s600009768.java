import java.util.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    Scanner cin = new Scanner(System.in);

    int N = cin.nextInt();
    int array[] = new int[N];
    int rev[] = new int[N];
    
    for( int i = 0; i < N; ++i ) {
    	array[i] = cin.nextInt() - 1;
    	rev[ array[i] ] = i;
    }
    
    
    int ans = 1;
    int cur = 0;
    while( cur < N ) {
    	int seq = 1;
    	while( cur + 1 < N && rev[ cur ] < rev[ cur + 1 ] ) {
    		++seq;
    		++cur;
    	}
    	ans = Math.max(ans, seq);
    	++cur;
    }
    
    System.out.println(N - ans);

    cin.close();

  }

}
