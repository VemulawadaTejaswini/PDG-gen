import java.lang.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  long[] p = new long[n];
  for(int i = 0; i < n; ++i) {
    p[i] = stdIn.nextLong();
  }
  
  long ans = 0;
  for(int i = 0; i < n - 1; i++) {
    for(int j = i + 1; j < n; j++) {
    long lcm = lcm(p[i], p[j]);
    ans += lcm;
    }
  }
  
  ans %= 998244353;
  System.out.println(ans);
}
  
static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
}


