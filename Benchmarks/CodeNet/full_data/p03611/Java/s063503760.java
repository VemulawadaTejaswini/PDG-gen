import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int[] numArr = new int[100003];

		for (int i = 0; i < N; i++) {
			int j = Integer.parseInt(s.next())+1;
			numArr[j]++;
			numArr[j - 1]++;
			numArr[j + 1]++;
		}

		Arrays.sort(numArr);

		System.out.println(numArr[100002]);
	}
}