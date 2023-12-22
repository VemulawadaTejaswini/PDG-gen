
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int count=0;
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			if (i == 0) {
				a[i] = ai;
			} else if ((a[i - 1]) == ai) {
				a[i] = 10001;
				count++;
			}else{
				a[i]=ai;
			}
		}
		System.out.println(count);

	}
}
