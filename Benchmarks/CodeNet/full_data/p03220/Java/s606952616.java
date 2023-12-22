import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	    int T = sc.nextInt();
	    int A = sc.nextInt();

	    double min = 1000;
	    int ans = 0;
	    for (int i=1; i<N+1; i++){
	    	double temp = T-0.006*sc.nextInt();
	    	if (Math.abs(temp-A)<min) {
	    		min = Math.abs(temp-A);
	    		ans = i;
	    	}
	    }
	    System.out.println(ans);
	}
	

}