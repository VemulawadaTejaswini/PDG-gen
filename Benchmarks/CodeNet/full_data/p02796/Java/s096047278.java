import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		sc.close();
		//並び替え
		long xt = 0L;
		long yt = 0L;
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(x[j-1]>x[j]){
					xt = x[j-1];
					x[j-1] = x[j];
					x[j] = xt;
					yt = y[j-1];
					y[j-1] = y[j];
					y[j] = yt;
				}
			}
		}
	 	long xi = x[0];
		long yi = y[0];
		int r = 0;
		for(int i=1;i<n;i++){
			if(x[i]-y[i]<=xi || xi+yi>=x[i]){
				r++;
			}else{
				xi = x[i];
				yi = y[i];
			}
		}
		System.out.println(n-r);
	}
}