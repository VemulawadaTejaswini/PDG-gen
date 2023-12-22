
import java.util.Scanner;

public class Main {

	public static long div = (long) (Math.pow(10, 9) + 7);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int blue = sc.nextInt();
		int red = n - blue;
		for(int i = 1; i < blue + 1; i++) {
			long bluepattern = 0;
			long redpattern = 0;
			if(i - 1 == 0) {
				bluepattern = 1;
			} else {
				bluepattern = comb(blue - 1, i - 1);
			}
			if(red >= 0) {
				redpattern = comb(red + i, i);
			}
			long ans = (bluepattern * redpattern) % div;
			System.out.println(ans);
			red--;
		}
	}

	public static long comb(long i, long j) {
		return (fact(i - j + 1, i) / fact(1, j)) % div;
	}

	public static long fact(long i, long j) {
		if(i == j) {
			return i;
		} else {
			return i * fact(i + 1, j);
		}
	}

}
