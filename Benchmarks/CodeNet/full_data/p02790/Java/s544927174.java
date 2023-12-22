
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int n;
		int m;
		if(a<=b) {
			n=a;
			m=b;
		} else {
			n=b;
			m=a;
		}
		for(int i=0; i<m; i++) {
			System.out.print(n);
		}
		System.out.println();
		sc.close();
	}
}
