import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int len = line.length();
		int[] arr = new int[len + 1];
		int seen = 0;
		int samesCon = 0;
		for (int i = 1; i < len; i++) {
			//おなじ
			if (line.charAt(i - 1) == line.charAt(i)) {
				samesCon++;
			}
			//ちがう
			if (line.charAt(i - 1) != line.charAt(i)) {
				int right =i;
				char target = line.charAt(i - 1);
				if (target == '<') {
					int num = 0;
					for (int j = seen; j <= right; j++) {
						if (arr[j] <= num) {
							arr[j] = num;
							num++;
						}
					}
				} else if (target == '>') {
					int num = 0;
					for (int j = right ; j >= seen; j--) {
						if (arr[j] <= num) {
							arr[j] = num;
							num++;
						}
					}
				}
				seen = right;
				samesCon = 0;
			}
			//終端
			if (i == len - 1) {
				int right =i + 1;
				char target = line.charAt(i);
				if (target == '<') {
					int num = 0;
					for (int j = seen; j <= right; j++) {
						if (arr[j] <= num) {
							arr[j] = num;
							num++;
						}
					}
				} else if (target == '>') {
					int num = 0;
					for (int j = right ; j >= seen; j--) {
						if (arr[j] <= num) {
							arr[j] = num;
							num++;
						}
					}
				}
			}
		}

		int sum =0;
		for (int i : arr) {
			sum += i;
		}

		System.out.println(sum);
	}

}