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
	  String s = cin.next();
	  
	  int Ecount = 0;
	  
	  for(int i = 0; i < N; ++i ) {
		  Ecount += (s.charAt(i) == 'E' ? 1: 0);
	  }
	  
	  int min = N;
	  
	  int Wcount = 0;
	  for( int i = 0; i < N; ++i ) {
		  if( s.charAt(i) == 'W' ) {
			  min = Math.min(min, Wcount + Ecount);
			  ++Wcount;
		  }
		  else {
			  --Ecount;
			  min = Math.min(min, Wcount + Ecount);
		  }
	  }
	  
	  System.out.println(min);
	  
  }

}
