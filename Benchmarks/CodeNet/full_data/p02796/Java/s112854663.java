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
	 	long xi = xy[0][0];
		long yi = xy[0][1];
		int r = 0;
		for(int i=1;i<n;i++){
			if(xy[i][0]-xy[i][1]<=xi || xi+yi>=xy[i][0]){
				r++;
			}else{
				xi = xy[i][0];
				yi = xy[i][1];
			}
		}
		System.out.println(n-r);
	}
}