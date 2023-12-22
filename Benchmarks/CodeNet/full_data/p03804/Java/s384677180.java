
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int M = Integer.parseInt(scan.next());

	String[] A = new String[N];
	for (int i = 0; i < N; i++) {
	    A[i] = scan.next();
	}
	
	String[] B = new String[M];
	for (int i = 0; i < M; i++) {
	    B[i] = scan.next();
	}

	boolean ans = false;
	for (int i = 0; i+M-1 < N; i++) {
	    int index = A[i].indexOf(B[0]);
	    if(index >= 0) {
		for (int j = 1; j < M; j++) {
		    ans = (A[i+j].indexOf(B[j]) >= 0 ? true : false);
		    if(ans == false) break;
		}
	    }
	    if(ans) break;
	}
	
	System.out.println(ans ? "Yes" : "No");
	scan.close();
    }
}
