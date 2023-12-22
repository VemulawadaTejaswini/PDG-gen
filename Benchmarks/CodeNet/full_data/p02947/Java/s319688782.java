import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i ++) {
			char[] arr = sc.next().toCharArray();
			Arrays.sort(arr);
			str[i] = String.valueOf(arr);
		}

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].equals(str[j]))
					ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
