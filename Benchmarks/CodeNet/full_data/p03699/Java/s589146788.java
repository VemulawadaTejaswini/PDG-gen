import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0, not10 = 101;
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
			if (s[i]%10 != 0 && not10 > s[i]) {
				not10 = s[i];
			}
		}
		if (sum % 10 == 0) {
			if (not10 != -1) {
				sum -= not10;
			} else {
				sum = 0;
			}
		}
		System.out.println(sum);
	}

}
