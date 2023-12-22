import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  int MOD = 1000 * 1000 * 1000 + 7;

  long rev(long K) {
	  return pow(K, MOD - 2);
  }
  
  long pow(long base, int times) {
	  if( times == 0 ) { return 1; }
	  if( times % 2 == 1 ) {
		  return pow(base * base % MOD, times / 2) * base % MOD;
	  }
	  return pow(base * base % MOD, times / 2);
  }
  
  void __solve(Scanner cin) {
	  int R = cin.nextInt();
	  int C = cin.nextInt();
	  int K = cin.nextInt();
	  long sum = R;
	  sum = sum * C - 2;
	  long ans = count(R, C) * rev(2) % MOD;
	  com(ans, sum, K - 2);
  }
  
  long count(int R, int C) {
	  long total = 0;
	  for( int i = 0; i < R; ++i ) {
		  total += (sum(i) + sum(R - i - 1)) * C * C % MOD;
	  }
	  for( int i = 0; i < C; ++i ) {
		  total += (sum(i) + sum(C - i - 1)) * R * R % MOD;
	  }
	  return total % MOD;
  }
  
  long sum(int i) {
	  return i * (i + 1L) / 2;
  }
  
  void com(long ans, long total, long K) {
	  K = Math.min(K, total - K);
	  //System.err.println(total + " " + K);
	  for( int i = 0; i < K; ++i ) {
		  ans = ans * (total - i) % MOD;
	  }
	  for( int i = 1; i <= K; ++i ) {
		  ans = ans * rev(i) % MOD;
	  }
	  System.out.println(ans);
  }
  

}
