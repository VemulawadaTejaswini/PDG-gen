import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] up = new long[n];
		long[] mid = new long[n];
		long[] end = new long[n];
		for(int i = 0; i < n; i++) {
			up[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			mid[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			end[i] = sc.nextLong();
		}
		Arrays.sort(up);
		Arrays.sort(mid);
		Arrays.sort(end);
		long count = 0;
		first: for(int i = 0; i < n; i++) {
			long selUp = up[i];
			//System.out.println("UP"+selUp);
			second: for(int m = 0; m < n; m++) {
				long selMid = mid[m];
				//System.out.println("MID"+selMid);
				if(selUp >= selMid) {
					//break second;
					continue;
				}
				therd: for(int j = 0; j < n; j++) {
					long selEnd = end[j];
					//System.out.println("END"+selEnd);
					if(selMid >= selEnd) {
						//break therd;
						continue;
					} else {
						count++;
						System.out.println("最終判定"+selUp+" "+selMid+" "+selEnd);
					}
				}
			}
		}
		System.out.println(count);
	}
}