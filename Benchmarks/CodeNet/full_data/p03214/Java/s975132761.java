
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		double x = 0.0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			x += a[i];
		}

		int ans = 0;
		double e = 100.0;

		x /= (double)n;
		for(int i=0;i<n;i++){
			if((double)Math.abs((double)a[i]-x)<e){
				ans = i;
				e = (double)Math.abs((double)a[i]-x);
			}
		}

		System.out.println(ans);
	}
}
