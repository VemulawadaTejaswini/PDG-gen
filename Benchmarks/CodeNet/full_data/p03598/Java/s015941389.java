import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n= sc.nextInt();
		int k = sc.nextInt();
		int x[] = new int[n];
		for(int i= 0; i < n ; i ++){
			x[i]  =sc.nextInt();
			
		}
		int sum = 0;
		for(int i = 0 ; i< n ; i++){
			sum += Math.min(x[i],k-x[i])*2;
		}
		System.out.println(sum);
	}
}
