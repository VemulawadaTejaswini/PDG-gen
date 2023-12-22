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
	  int N = cin.nextInt();
	  int K = cin.nextInt();
	  
	  int min = 1;
	  int max = N;
	  for( int i = 0; i < K; ++i ) {
		  int L = cin.nextInt();
		  int R = cin.nextInt();
		  min = Math.max(min, L);
		  max = Math.min(max, R);
	  }
	  System.out.println(Math.max(0, max - min + 1));
  }

}
