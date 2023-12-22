import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int cont = 0;
		int[] counter = new int[N];
		//
		char last = sc.next().charAt(0);
		counter[0]++;
		for (int i=1; i<N; i++) {
			if (counter[cnt]==K) {
				cnt++;
			}
			char c = sc.next().charAt(0);
			if (c==last) {
				counter[cnt+(++cont)]++;
			} else {
				counter[cnt]++;
				cont=0;
			}
		}
		if (counter[cnt]==K) cnt++;
		System.out.println(cnt);
		sc.close();
	}
}
