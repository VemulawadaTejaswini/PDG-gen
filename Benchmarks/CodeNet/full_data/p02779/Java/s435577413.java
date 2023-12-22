import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// int A = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		for (int j = 1; j < array.length; j++) {
			if (array[j - 1] == array[j]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}