
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long sum = 0;
		for(int i=0; i<m; i++) {
			sum += sc.nextLong();
		}
		if(n<sum) {
			System.out.println(-1);
		}else {
			System.out.println(n-sum);
		}
		sc.close();
	}


}
