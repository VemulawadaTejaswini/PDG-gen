import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	
	void compute() {
		int N = scan.nextInt();
		int m = 0;
		int[] t = new int[N];
		for(int i=0; i<N; i++) {
			t[i] = scan.nextInt();
		}
		for(int i=0; i<N; i++) {
			m = t[1];		 
	        for (int index = 0; index < N; index ++) {
	        	if(index != i) {
		            m = Math.max(m, t[index]);
	        	}
	        }
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}
