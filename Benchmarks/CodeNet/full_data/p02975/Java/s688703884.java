import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i] =sc.nextLong();
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			if((a[(i-1+n)%n]^a[(i+1+n)%n]^a[i])!=0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}


