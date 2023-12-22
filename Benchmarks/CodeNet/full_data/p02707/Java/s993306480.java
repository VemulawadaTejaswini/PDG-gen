import java.util.Scanner;

class Main {
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			a[sc.nextInt() - 1]++;
		}

		for (int x : a) {
			System.out.println(x);
		}

		sc.close();
	}
}

