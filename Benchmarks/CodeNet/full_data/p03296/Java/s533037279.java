
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();

		int prev = -1;
		int count = 0;
		for(int i = 0; i < n ; i++){
			int now = sc.nextInt();
			
			if(prev == now){
				count ++;
				now = -1;
			}
			prev = now;
		}
				
		System.out.println(count);
	}
}
