import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	int C = sc.nextInt();
	int D = sc.nextInt();	
    	System.out.println(A+B > C+D ? "Left" : (A+B < C+D ? "Right" : "Balanced"));
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	int ans = 0;

	for(int i = 1 ; i <= N ; i++){
	    int n = i;
	    int cnt = 0;
	    while(n > 0){
		cnt += n % 10;
		n /= 10;
	    }
	    ans += (cnt>=A && cnt<=B ? i : 0);
	}
	System.out.println(ans);
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong();
    	long B = sc.nextLong();
	int ans = 0;

	while(A<=B){
	    ans++;
	    A *= 2;   
	}
	System.out.println(ans);
    }
    private void solveD() {
    }
}