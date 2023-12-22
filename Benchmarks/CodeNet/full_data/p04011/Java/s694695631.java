import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sum = sc.nextLong();
		double base = 2;
		int flag = 0;

		for (base = 2;base <= num;base++) {
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
		}
		
		if (flag == 1) {
			System.out.println((int) base);
		}
//		else if (sum == 1) {
//			System.out.println(num);
//		}
		else {
			System.out.println("-1");
		}
	}
}