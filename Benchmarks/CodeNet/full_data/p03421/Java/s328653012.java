
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a+b > n + 1){
			System.out.println(-1);
			return;
		}
		
		if(a*b < n){
			System.out.println(-1);
			return;
		}
		
		
		x(a,b,n);		
		
		
	}

	void x(int a, int b, int n) {

		int z = n;
		int[] res = new int[n];
		int ind = 0;
		for (int x = Math.min(a * (b-1) + 1, z);ind < n;z = x-1,x = Math.min(a * (b-1) + 1, z)) {			
			for (int y = x; y <= z; y++) {
				res[ind] = y;
				ind++;
			}
			b--;
		}
		for(int i =0  ; i < n-1 ; i ++){
			System.out.print(res[i] + " ");
		}
		System.out.println(res[n-1]);
			
	}

}
