import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		while(true) {
			if(prime(n)) {
				break;
			}
			n++;
		}
		System.out.println(n);
		sc.close();
	}

	private boolean prime(int n) {
		if(n==0||n==1) {
			return false;
		}
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i=3; i*i<=n; i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
