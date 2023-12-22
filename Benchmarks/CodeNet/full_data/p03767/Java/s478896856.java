import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long total = 0;
		long[] a = new long[3*n];
		for(int i=0; i<3*n; i++){
			a[i] = scan.nextInt();
		}
		for(int i=1; i<3*n-1; i++){
			for(int j=3*n-1; j>=i; j--){
				if(a[j-1]<a[j]){
					long k = a[j-1];
					a[j-1] = a[j];
					a[j] = k;
				}
			}
			if(i%2==0&&i<=2*n){
				total = total + a[i-1];
			}
		}
		System.out.println(total);
	}
}