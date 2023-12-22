import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long x = scan.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextLong();
		}

		long before = 0;
		for(int i = 0; i < n; i++){
			before += a[i];
		}

		if(a[0] > x){
			a[0] = x;
		}
		for(int i = 1; i < n; i++){
			if(a[i-1] + a[i] > x){
				while(a[i-1]+a[i] > x){
					a[i] --;
				}
			}
		}
		long after = 0;
		for(int i = 0; i < n; i++){
			after += a[i];
		}
		System.out.println(before - after);
	}
}
