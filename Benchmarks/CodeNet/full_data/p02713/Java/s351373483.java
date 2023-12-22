import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int ans = 0;

//a,b,cがすべて等しい．
		num1 = K*(K+1) / 2;

//a,b,cのうち2つが等しい．
		for (int a = 1; a < K; a++) {
			for (int b = a+1; b < K+1; b++) {
				num2 += gcd2(a, b);
			}
		}


//a,b,cがすべて異なる．
		for (int a = 1; a < K-1; a++) {
			for (int b = a+1; b < K; b++) {
				for (int c = b+1; c < K+1; c++) {
					num3 += gcd3(a, b, c);
				}
			}
		}

		ans = num1 + num2*6 + num3*6;

		System.out.println(ans);
	}

	public static int gcd2(int x, int y) {
		int i = x;

		while (i > 1) {
			if (x%i == 0 && y%i == 0) {
				break;
			}
			i--;
		}

		return i;
	}

	public static int gcd3(int x, int y, int z) {
		int i = x;

		while (i > 1) {
			if (x%i == 0 && y%i == 0 && z%i == 0) {
				break;
			}
			i--;
		}

		return i;
	}

}