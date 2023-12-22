import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		int cnt=0;
		while(n>0) {
			n=n/k;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
