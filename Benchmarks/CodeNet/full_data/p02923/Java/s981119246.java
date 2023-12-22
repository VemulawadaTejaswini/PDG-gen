import java.util.Scanner;

public class Main{

	static int max = 0;
	static int n;
	static int a[] = new int[100000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n;) {
			i += calc(i);
		}
		System.out.println(max);
	}

	public static int calc(int i) {
		int count = 0;
		while (i < n - 1 && a[i] >= a[i + 1]) {
			i++;
			count++;
		}
		if (count > max)
			max = count;
		if (count == 0)
			return 1;
		return count;
	}

}
