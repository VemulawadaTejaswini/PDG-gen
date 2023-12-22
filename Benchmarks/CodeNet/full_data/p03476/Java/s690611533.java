
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < q; i++) {
			int ltmp = sc.nextInt();
			int rtmp = sc.nextInt();
			min = Math.min(ltmp, min);
			max = Math.max(rtmp, max);
			l[i] = ltmp;
			r[i] = rtmp;
		}
		int[] sum = new int[max - min + 3];
		for(int i = 0; i < max - min + 3; i++) {
			sum[i] = 0;
		}
		for(int i = 2; i < max - min + 3; i = i + 2) {
			int tmp = min + i - 2;
			if(tmp != 1) {
				boolean flag = true;
				for(int j = 2; j < tmp; j++) {
					if(tmp % j == 0) {
						flag = false;
						break;
					}
				}
				for(int j = 2; j < (tmp + 1) / 2; j++) {
					if((tmp + 1) / 2 % j == 0) {
						flag = false;
						break;
					}
				}
				if(flag)
					sum[i]++;
			}
			sum[i] += sum[i - 2];
		}
		for(int i = 0; i < q; i++) {
			int ans = sum[r[i] - min + 2] - sum[l[i] - min];
			System.out.println(ans);
		}
	}

}
