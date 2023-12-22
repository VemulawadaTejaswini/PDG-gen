import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int k = sc.nextInt();
		
		int min = 45;
		for(long i = 1 ; i < k*100000 ; i++){
			long v = (long)k*i;
			int val = calc(v , min);
			min = Math.min(min, val);
		}
		System.out.println(min);
		
	}
	
	int calc(long v, int min){
		int d = 0;
		while(v > 0 && min > d){
			d += v%10;
			v = v/10;
		}
		return d;		
	}
	
}
