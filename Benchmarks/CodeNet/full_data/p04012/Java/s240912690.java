import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] w = sc.next().toCharArray();

		int flag = 0;
		Arrays.sort(w);

		for (int i = 0; i < w.length  ;i+=2) {
			if (w[i] != w[i+1]) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
