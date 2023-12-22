import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sum = sc.nextLong();
		double base = 10;
		int flag = 0;
		if (sum == 1) {
			flag = 2;
		}
		for (int i = 1;i < String.valueOf(num).length();i++) {
			long tmp = num;
			int cur_sum = 0;
			while (tmp / base > 0) {
				cur_sum += tmp % base;
				tmp /= base;
				//System.out.println(cur_sum);
			}
			if (cur_sum == sum) {
				flag = 1;
				break;
			}
			base = Math.pow(base, i + 1);
		}
		if (flag == 1) {
			System.out.println((int) base);
		}
		else if (flag == 2) {
			System.out.println(num);
		}
		else {
			System.out.println("-1");
		}
	}
}