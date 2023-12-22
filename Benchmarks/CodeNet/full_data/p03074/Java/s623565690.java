import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxTime = sc.nextInt();
		String str = sc.next();
		int startHS = str.charAt(0) == '1' ? 0 : 1;
		int group[] = new int[num];
		int crt = 1;
		int numG = 0;
		for(int i = 1; i < num; i ++) {
			if(str.charAt(i) == str.charAt(i - 1)) {
				crt ++;
			}else {
				group[numG] = crt;
				numG ++;
				crt = 1;
			}
		}
		group[numG] = crt;
		numG ++;

		if((numG + startHS) / 2 <= maxTime) {
			System.out.println(num);
		}else {
			int sum[] = new int[numG + 1];
			sum[0] = 0;
			for(int i = 1; i < numG + 1; i ++) {
				sum[i] = group[i - 1] + sum[i - 1];
			}
			int can[] = new int[numG + 1];
			for(int i = 0; i <= numG; i ++) {
				can[i] = 0;
			}
			for(int i = startHS; i < numG; i += 2) {
				can[i] = sum[i + 1] - sum[Math.max(0, i - maxTime * 2)];
			}
			if(str.charAt(num - 1) == '0') {
				can[numG] = sum[numG] - sum[Math.max(0, numG - maxTime * 2)];
			}
			int max = 0;
			for(int i = 0; i <= numG; i ++) {
				max = Math.max(max, can[i]);
			}
			System.out.println(max);
		}
	}
}