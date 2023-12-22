
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();
		int K=sc.nextInt();

		if(K>=(int)Math.pow(2, M)) {
			System.out.println(-1);
			sc.close();
			return;
		}

		if(M==0) {
			System.out.println("0 0");
			sc.close();
			return;
		}

		if(M==1) {
			if(K==0) {
				System.out.println("0 0 1 1");
				sc.close();
				return;
			}else {
				System.out.println("-1");
				sc.close();
				return;
			}
		}

		for(int i=0; i<(int)Math.pow(2,M); i++) {
			if(i==K) continue;
			if(i!=0) System.out.print(" ");
			System.out.print(i);
		}
		System.out.print(" "+K);
		for(int i=(int)Math.pow(2, M)-1; i>=0; i--) {
			System.out.print(" "+i);
		}
		System.out.print(" "+K);

		System.out.println();

		sc.close();
	}
}
