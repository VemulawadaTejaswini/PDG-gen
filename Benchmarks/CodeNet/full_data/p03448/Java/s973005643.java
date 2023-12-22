import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int count = 0;
		for(int i=0; i<=A; i++) {
			for(int j=0; j<=B; j++) {
				int sum = i*500 + j*100;
				int k = (X - sum) / 50;
				if(k > C || k < 0) continue;
				count++;
			}
		}

		System.out.println(count);
	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}