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
	  int R = cin.nextInt();
	  int D = cin.nextInt();
	  long init = cin.nextInt();
	  for( int i = 0; i < 10; ++i ) {
		  init = Math.max(0, init * R - D);
		  System.out.println(init);
	  }
  }

}
