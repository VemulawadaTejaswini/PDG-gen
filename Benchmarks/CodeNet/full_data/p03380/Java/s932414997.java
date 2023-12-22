import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i = 0; i<n; i++){
			a[i]= sc.nextLong();
		}
		Arrays.sort(a);
		int t=Arrays.binarySearch(a,a[n-1]/2);
		long b=0;
		if(t<0){
			t=-t-1;
			if(t-1>=0){
				if(a[t]-(a[n-1]/2)>(a[n-1]/2)-a[t-1]){
					b=a[t-1];
				}else{
					b=(a[t]==a[n-1])? a[t-1]:a[t];
				}
			}else{
				b=a[t];
			}
		}else{
			b=a[t];
		}
			System.out.println(a[n-1]+" "+b);
	}
}