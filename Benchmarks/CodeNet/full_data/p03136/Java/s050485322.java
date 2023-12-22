import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner scan = new Scanner(System.in);
    String Nstr = scan.next();
    int N = Integer.parseInt(Nstr);
    int[] h = new int[N];
    for( int i = 0; i < N; i++ ) {
        h[i] = scan.nextInt();
    }
    int max = 0;
    for( int i = 0; i < N; i++ ) {
    	if( h[i] > max ) {
    		max = h[i];
    	}
    }
    int NonMaximumSideTotal = 0;
    for( int i = 0; i < N; i++ ) {
    	if( h[i] != max ) {
    		NonMaximumSideTotal += h[i];
    	}
    }
    if( max < NonMaximumSideTotal ) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }

}