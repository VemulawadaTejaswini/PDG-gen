import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x1 = new long[n];
		long[] y1 = new long[n];
		long[] x2 = new long[m];
		long[] y2 = new long[m];
		long min;
		long dist;
		int p;

		for(int i=0; i<n; i++){
			x1[i] = sc.nextLong();
			y1[i] = sc.nextLong();
		}
		for(int i=0; i<m; i++){
			x2[i] = sc.nextLong();
			y2[i] = sc.nextLong();
		}

		for(int i=0; i<n; i++){
			min = Long.MAX_VALUE;
			p=0;
			for(int j=0; j<m; j++){
				dist = Math.abs(x1[i]-x2[j]) + Math.abs(y1[i]-y2[j]);
				if( dist < min ){
					min = dist;
					p = j;
				}
			}

			System.out.println(p+1);
		}

		return;
	}
}