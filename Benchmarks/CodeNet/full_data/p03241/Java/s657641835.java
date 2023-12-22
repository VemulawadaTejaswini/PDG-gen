
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int max = 0;
		
		for(int i = 1; i <= Math.sqrt(m)+0.0001; i++){
			if(m % i == 0){
				if(m/i >= n){
					max = Math.max(max, i);
				}
				if(i >= n){
					max = Math.max(max, m/i);
				}
			}
		}
		System.out.println(max);
		
	}
}
