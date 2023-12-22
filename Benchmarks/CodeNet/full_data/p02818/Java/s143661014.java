import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();

		if(a<=k) {
			k-=a;
			a=0;
		} else {
			a-=k;
			k=0;
		}

		if(b<k) {
			k-=b;
			b=0;
		} else {
			b-=k;
			k=0;
		}

		System.out.println(a+" "+b);
		sc.close();
	}
}
