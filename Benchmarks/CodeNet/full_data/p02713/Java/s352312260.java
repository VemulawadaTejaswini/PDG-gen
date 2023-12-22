import java.util.Scanner;

class Main {
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					int tmp = gcd(j, k);
					sum += gcd(i, tmp);
				}
			}
		}

		System.out.println(sum);

		sc.close();
	}

    public static int gcd(int m, int n) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}