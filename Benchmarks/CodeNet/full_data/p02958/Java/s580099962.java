import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];
		int pSort[] = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			pSort[i] =p[i];
		}
	
		Arrays.sort(pSort);
		
		for (int i = 0; i < N; i++) {
			if (p[i] != pSort[i]) {
				count++;
			}
		}
		if (count / 2 == 1 || count == 0) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}
}