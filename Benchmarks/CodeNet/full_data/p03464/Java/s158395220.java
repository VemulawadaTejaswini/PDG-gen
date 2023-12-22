import java.util.Scanner;

class Main {
	static int k, maxi, mini;
	static int a[] = new int[100005];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		for (int i = 0; i < k; i++)
			a[i] = sc.nextInt();
		maxi = mini = 2;
		for (int i = k - 1; i >= 0; i--) {
			if (mini % a[i] == 0)
				mini = (mini / a[i]) * a[i];
			else
				mini = ((mini / a[i]) + 1) * a[i];
			maxi = ((maxi / a[i]) * a[i]) + (a[i] - 1);
		}
		if (mini <= maxi)
			System.out.println(mini + " " + maxi);
		else
			System.out.println("-1");
		sc.close();
	}
}