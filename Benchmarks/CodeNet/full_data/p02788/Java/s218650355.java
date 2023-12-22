import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute5_4();
	}
	
	private static void execute5_4() {
		try (Scanner sc = new Scanner(System.in)) {
			
			int N = sc.nextInt();
			long D = sc.nextLong();
			long A = sc.nextLong();
			
			long[][] a = new long[N][2];
			for(int i=0; i<N;i++) {
				a[i][0]=sc.nextLong();
				a[i][1]=sc.nextLong();
			}
			Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));

			long ans =0;
			for(int i=0; i<N;i++) {
				if(a[i][1]<1) {
					continue;
				}
				long t = (a[i][1]+A-1)/A;
				ans +=t;
				for(int x=i+1;x<N;x++) {
					if(a[x][0]>D*2+a[i][0]) {
						break;
					}
					a[x][1]-=A*t;
				}
			}
			System.out.println(ans);
		}
	}
}