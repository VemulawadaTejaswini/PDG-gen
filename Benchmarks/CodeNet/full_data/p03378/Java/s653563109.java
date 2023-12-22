import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	int X = sc.nextInt();	
    	System.out.println(A > X ? "NO" : (A+B >= X ? "YES" : "NO"));
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    	int M = sc.nextInt();
	int X = sc.nextInt();

	int[] a = new int[M];

	for(int i=0; i < M; i++){
	    a[i] = sc.nextInt();	    
	}

	int ans1=0;
	for(int i=X; i > 0; i--){
	    for(int j=0; j < M; j++){
		if (a[j] == i) ans1++;	    
	    }
	}

	int ans2=0;
	for(int i=X; i < N; i++){
	    for(int j=0; j < M; j++){
		if (a[j] == i) ans2++;	    
	    }
	}
	System.out.println(Math.min(ans1,ans2));
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	System.out.println();
    }
    private void solveD() {
	Scanner sc = new Scanner(System.in);
	System.out.println();
    }
}