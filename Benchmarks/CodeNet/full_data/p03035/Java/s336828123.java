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
	  int A = cin.nextInt();
	  int B = cin.nextInt();
	  if( A >= 13 ) {
		  //;
	  }
	  if( 6 <= A && A <= 12 ) {
		  B /= 2;
	  }
	  if( A <= 5 ) {
		  B = 0;
	  }
	  System.out.println(B);
  }

}
