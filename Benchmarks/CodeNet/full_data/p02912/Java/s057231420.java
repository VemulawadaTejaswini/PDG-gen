import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0; i<m; i++){
			a[n-1]/=2;
			Arrays.sort(a);
		}
		long sum=0;
		for(int i=0; i<n; i++){
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
