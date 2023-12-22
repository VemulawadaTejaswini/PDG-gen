
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(c(n)+c(m));
		sc.close();
	}

	private long c(int n) {
		if(n==0) return 0;
		return(n*(n-1))/2;
	}

}
