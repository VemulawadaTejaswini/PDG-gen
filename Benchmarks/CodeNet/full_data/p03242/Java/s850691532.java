import java.util.Scanner;

public class C111 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[]=new int[N/2];
		int b[]=new int[N/2];
		int d[]=new int[100001]; 
		int f[]=new int[100001]; 
		int l=N/2;
		for(int i=0;i<N/2;i++) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		
		for (int i = 0; i < l; i++) {
			d[a[i]]++;				// 頻度を数える：a[i]の値に該当する頻度値を1増やす
		}
		int max=1;
		for (int i = 1; i < 100001; i++) {
			if (d[i] > d[max]) {
				max = i;			// 最大頻度を求める
			}
		}
		
		for (int i = 0; i < l; i++) {
			f[b[i]]++;				// 頻度を数える：a[i]の値に該当する頻度値を1増やす
		}
		
		int max2=1;
		for (int i = 1; i < 100001; i++) {
			if (f[i] > f[max2]) {
				max2 = i;			// 最大頻度を求める
			}
		}
		
	    if(l-d[max]==0&&l-f[max2]==0&&b[0]==a[0]) {
	    	System.out.println(l);
	    }else {
	    	System.out.println(l-d[max]+(l-f[max2]));	    	
	    }

	}
}
