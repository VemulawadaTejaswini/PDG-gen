import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int d;
	int[] dCount = new int[101];
	for ( int i=0; i<n; i++ ) {
	    d = sc.nextInt();
	    dCount[d]++;
	}

	int cnt = 0;
	for ( int i=1; i<101; i++ ) {
	    if ( dCount[i] > 0 ) {
		cnt++;
	    }
	}

	System.out.println(cnt);
    }
    
}