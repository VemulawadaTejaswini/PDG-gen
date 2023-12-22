import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j,k,l,m,a,x,y;

		int pt = (int)Math.pow(2, n) - 1;
		ArrayList<Integer[]> list = new ArrayList<>();
		for(i = 0; i < n; i++) {
			Integer[] temp = new Integer[n];
			Arrays.fill(temp, -1);
			a = scan.nextInt();
			for(j = 0; j < a; j++) {
				x = scan.nextInt();
				y = scan.nextInt();
				temp[x - 1] = y;
			}
			list.add(temp);
		}

		int[] ptList = new int[n];
		Integer[] temp;
		int cnt;
		int max = Integer.MIN_VALUE;
		boolean f;

		for(i = 0; i <= pt; i++) {
			int[] ans = new int[n];
			Arrays.fill(ans, -1);
			for(j = 0; j < n; j++) {
				ptList[j] = (1 & i >> j);
			}
			cnt = 0;
			f = true;
			for(k = 0; k < n; k++) {
				temp = list.get(k);
				for(l = 0; l < n; l++) {
					if(temp[l] != -1) {
						if(ptList[k] == 0) {
							if(temp[l] == 0) {
								if(ans[l] != -1 && ans[l] == 0) {
									f = false;
									break;
								}
								ans[l] = 1;
							}else {
								if(ans[l] != -1 && ans[l] == 1) {
									f = false;
									break;
								}
								ans[l] = 0;
							}
						}else {
							if(ans[l] != -1 && ans[l] != temp[l]) {
								f = false;
								break;
							}
							ans[l] = temp[l];
						}
					}
				}
			}
			for(m = 0; m < n; m++) {
				if(ans[m] == -1)
					continue;
				if(ans[m] != ptList[m]) {
					f = false;
					cnt = 0;
					break;
				}
			}
			if(f) {
				for(m = 0; m < n; m++)
					if(ans[m] == 1)
						cnt++;
			}else {
				cnt = 0;
			}

			if(cnt > max)
				max = cnt;
		}
		System.out.println(max);
	}
}