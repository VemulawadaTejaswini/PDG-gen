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

  void __solve(Scanner cin) {
	  int M = cin.nextInt();
	  int K = cin.nextInt();
	  if( K == 0 ) {
		  for( int i = 0; i < (1 << M); ++i ) {
			  if( i > 0 ) { System.out.print(" "); }
			  System.out.print(i + " " + i);
		  }
		  System.out.println();
		  return;
	  }
	  int total = 0;
	  for( int i = 0; i < (1 << M); ++i ) {
		  if( i == K ) { continue; }
		  total ^= i;
	  }
	  if( total == K ) {
		  for( int i = 0; i < (1 << M); ++i ) {
			  if( i == K ) { continue; }
			  System.out.print(i + " ");
		  }
		  System.out.print(K + " ");
		  for( int i = (1 << M) - 1; i >= 0; --i ) {
			  if( i == K ) { continue; }
			  System.out.print(i + " ");
		  }
		  System.out.println(K);
		  return;
	  }
	  System.out.println(-1);
  }

}
