import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		if(k >= 1<<m) {
			System.out.println(-1);
			return;
		}
		
		if(m == 1 && k == 1) {
			System.out.println(-1);
			return;
		}
		
		if(m == 0) {
			if(k == 0) {
				System.out.print("0 0");
				return;
			}else {
				System.out.println(-1);
			}
			return ;
		}
		
		if(k == 0) {
			System.out.print("0 0");
			
			for(int i = 1; i < 1 <<m;i++) {
				System.out.print(" ");
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i);
			}
		}else {
			
			System.out.print(k);
			
			for(int i = 1; i < 1 <<m;i++) {
				if(i == k) continue;
				System.out.print(" ");
				System.out.print(i);
			}
			
			System.out.print(" ");
			System.out.print(k);

			System.out.print(" ");
			System.out.print(0);

			for(int i = (1<<m)-1 ; i > 0; i--) {
				if(i == k) continue;
				System.out.print(" ");
				System.out.print(i);
			}
			
			System.out.print(" ");
			System.out.print(0);
		}
		
	}
}
