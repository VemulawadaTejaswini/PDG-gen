
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		long cnt=1;
		while(true) {
			x *= 2;
			if(x>y) break;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
