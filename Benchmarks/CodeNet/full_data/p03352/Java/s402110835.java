import java.util.Scanner;

public class atcoder_20180512_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int nums[] = { 8, 27, 64, 125, 216, 343, 512, 729, 32, 243, 128, 512 };
		for (int i = 1; i <= 32; i++) {

			if (input == i * i) {
				System.out.println(i * i);
				break;
			}

			if ((input > i * i) && input < (i + 1) * (i + 1)) {
				int binary = i * i;
				for (int s : nums) {
					if (s <= input && s > binary) {
						System.out.println(s);
						break;
					}
				}
				System.out.println(binary);
				break;
			}
		}
	}
}
