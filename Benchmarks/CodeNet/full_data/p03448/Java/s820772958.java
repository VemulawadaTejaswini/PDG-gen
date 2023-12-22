import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int cnt=0;
		for (int a=0;a<A+1;a++) {
			for (int b=0;b<B+1;b++) {
				int x = X-a*500-b*100;
				if (x>=0 && x%50==0 && x/50<=C) {
					cnt++;
				}

			}
		}
		System.out.println(cnt);
	}
}