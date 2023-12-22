import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j, k;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		for(i=0;i<n;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int dx,dy;
		int max = 0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)continue;
				dx = x[i]-x[j];
				dy = y[i]-y[j];
				int cnt = 2;
				for(k=0;k<n;k++) {
					if(i==k || j == k)continue;
//					System.out.println(""+x[i]+","+y[i]+":"+x[k]+","+y[k]);
					if(x[i]-x[k] == 0 || dx==0) {
						if(dx==x[i]-x[k]) {
							cnt++;
//							System.out.println(""+x[k]+",0");
						}
					} else if(y[i]-y[k] == 0||dy == 0) {
						if(dy == y[i]-y[k]) {
							cnt++;
//							System.out.println("0,"+y[k]);
						}
					} else if((x[i]-x[k])%dx==0
							&& (y[i]-y[k])%dy==0) {
						cnt++;
//						System.out.println(""+x[k]+","+y[k]);
					}
				}
				if(cnt > max)max=cnt;
			}
		}
		if(max==n)max--;
//		System.out.println(max);
		System.out.println(n-max);
	}
}
