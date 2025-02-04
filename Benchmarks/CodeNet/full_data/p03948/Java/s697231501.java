import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		sc.close();
		
		long cmax = 0;
		long maxv = 0;
		
		for(int i=n-1; i>=0; i--){
			if(a[i] > cmax){
				cmax = a[i];
			}
			if(cmax - a[i] >= maxv){
				maxv = cmax - a[i];
			}
		}
		
		int ans = 0;
		cmax = 0;
		
		for(int i=n-1; i>=0; i--){
			if(a[i] > cmax){
				cmax = a[i];
			}
			if(cmax - a[i] == maxv){
				ans++;
			}
		}
		
		System.out.println(ans);

	}

}