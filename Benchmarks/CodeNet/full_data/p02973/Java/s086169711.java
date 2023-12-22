import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans=n;
		long[] a=new long[n];
		long min=Long.MAX_VALUE;
		for(int i=0; i<n; i++){
			a[i] =sc.nextLong();
			if(i!=0){
				if(a[i]<=a[i-1]){
					if(min<a[i-1]){
						ans--;
					}
					min=a[i-1];
				}else{
					ans--;
				}
			}
		}
		System.out.println(ans);
	}
}


