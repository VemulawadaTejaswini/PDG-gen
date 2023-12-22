import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] xy = new long[n][2];
		for(int i=0;i<n;i++){
			xy[i][0] = sc.nextLong();
			xy[i][1] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(xy, (x, y) -> Long.compare(x[0], y[0]));
		int r = 0;
		boolean[] rm = new boolean[n];
		for(int i=0;i<n;i++){
			// 右に腕を伸ばしたときにx(i+1)と重なるか
			if(i+1<n && !rm[i+1] && xy[i][0]+xy[i][1]>=xy[i+1][0]){
				r++;
				rm[i] = true;
			}else
			// 左に腕を伸ばしたときにx(i-1)と重なるか
			if(i>0 && !rm[i-1] && xy[i][0]-xy[i][1]<=xy[i-1][0]){
				r++;
				rm[i] = true;
			}
		}
		System.out.println(n-r);
	}
}