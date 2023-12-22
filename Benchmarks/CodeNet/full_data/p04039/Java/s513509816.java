import java.util.Scanner;

public class Main {

	private static int pay = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] dislike = new int[K];
		for(int i = 0; i < dislike.length; i++) {
			dislike[i] = Integer.parseInt(sc.next());
		}

		for(; N < 10000; N++) {
			if(check(N, dislike)) {
				System.out.println(pay);
				break;
			}
		}
	}

	static boolean check(int N, int[] dislike) {
		int[] temp = new int[4];
		temp[3] = N / 1000;
		temp[2] = (N %= 1000) / 100;
		temp[1] = (N %= 100) / 10;
		temp[0] = N %= 10;

		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < dislike.length; j++) {
				if(temp[i] == dislike[j]) {
					return false;
				}
			}
		}
		pay = temp[3] * 1000 + temp[2] * 100 + temp[1] * 10 + temp[0];
		return true;
	}
}