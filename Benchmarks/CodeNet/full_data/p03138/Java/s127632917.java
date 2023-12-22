import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long max = sc.nextLong();
		long val[] = new long[num];
		for(int i = 0; i < num; i ++) {
			val[i] = sc.nextLong();
		}
		int digit = 0;
		double tmp = max;
		while(true) {
			if(tmp / 2.0 >= 1) {
				digit ++;
				tmp /= 2.0;
			}else {
				break;
			}
		}
		long ans = 0;
		for(int i = digit; i >= 0; i --) {
			if(ans + (long) Math.pow(2, i) <= max) {
				int count = 0;
				for(int j = 0; j < num; j ++) {
					if(Math.floor((val[j] % Math.pow(2, i + 1)) / Math.pow(2, i)) == 1) {
						count ++;
					}else {
						count --;
					}
				}
				if(count < 0) {
					ans += (long) Math.pow(2, i);
				}
			}
		}
		long sum = 0;
		for(int i = 0; i < num; i ++) {
			sum += ans ^ val[i];
		}
		System.out.println(sum);
	}
}