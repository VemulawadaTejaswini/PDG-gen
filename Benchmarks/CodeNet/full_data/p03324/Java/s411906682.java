import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		if(d == 0) {
			if(n < 100) System.out.println(n);
			else if(n == 100) System.out.println(101);
			return;
		}
		
		int h = 100;
		if(d == 2) h = 10000; 
		for(int i=1; i<=10000000; i++) {
			if(i % h == 0) {
				if(n == 1) {
					System.out.println(i);
					return;
				} else n--;			
			} 
		}
	}

}