import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),D=sc.nextInt();
		int[][] map = new int[N][D];
		int ans=0;

		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				map[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				double d=0;
				for(int k=0;k<D;k++) {
					d+=(map[i][k]-map[j][k])*(map[i][k]-map[j][k]);
				}
				d=Math.sqrt(d);
				if(d==Math.floor(d)) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
