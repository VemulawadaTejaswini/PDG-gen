import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] like = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 0; i <K; i++) {
			int dislike = Integer.parseInt(sc.next());
			like[dislike] = -1;
		}

		int min = 0;
		for(int i = 0; i < like.length; i++) {
			if(like[i] != -1) {
				min = like[i];
				break;
			}
		}

		int[] digits = digit(N);
		int[] pay = new int[4];

		boolean flag = false;
		for(int i = 3; i >= 0; i--) {
			if(digits[i] == 0 && flag == false) {
				pay[i] = 0;
				continue;
			}else {
				flag = true;
				pay[i] = check(digits[i], digits[i], like);
				if(pay[i] != digits[i]) {
					for(int j = i-1; j >= 0; j--) {
						pay[j] = min;
					}
					break;
				}

			}

		}

		System.out.println(pay[3] + pay[2] + pay[1] + pay[0]);

	}

	static int[] digit(int N) {
		int[] temp = new int[4];
		temp[3] = N / 1000;
		temp[2] = (N %= 1000) / 100;
		temp[1] = (N %= 100) / 10;
		temp[0] = N %= 10;
		return temp;
	}

	static int search(int base, int[] like) {
		for(int i = base; i <= 9; i++) {
			if(like[i] != -1) {
				return i;
			}
		}
		return 0;
	}

	static int check(int num, int digit, int[] like) {
		if(like[num] == -1) {
			check(num+1, digit, like);
		}else {
			if(num != digit) {
				return num;
			}else {
				return digit;
			}
		}
		return -1;
	}

}
