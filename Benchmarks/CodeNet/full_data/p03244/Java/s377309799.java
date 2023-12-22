import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counts[][] = new int[2][100010];
		for(int i = 0; i < num; i ++) {
			counts[i % 2][sc.nextInt()] ++;
		}
		int maxCount[][] = {{0, 0}, {0, 0}};
		int maxNumber[] = {0, 0};
		for(int i = 1; i < 100010; i ++) {
			for(int j = 0; j < 2; j ++) {
				if(counts[j][i] > maxCount[j][0]) {
					maxCount[j][0] = counts[j][i];
					maxNumber[j] = i;
				}else if(counts[j][i] > maxCount[j][1]) {
					maxCount[j][1] = counts[j][i];
				}
			}
		}
		int ans = num;
		if(maxNumber[0] == maxNumber[1]) {
			ans -= Math.max(maxCount[0][0] + maxCount[1][1], maxCount[0][1] + maxCount[1][0]);
		}else {
			ans -= maxCount[0][0] + maxCount[1][0];
		}
		System.out.println(ans);
	}
}