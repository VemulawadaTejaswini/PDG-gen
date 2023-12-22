import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] q = new long[n];
		long sum=0;
		for(int i = 0; i < n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			q[i]=a+b;
			sum-=b;
		}
		Arrays.sort(q);
		for(int i=n-1; i>=0; i-=2){
			sum+=q[i];
		}
		System.out.println(sum);
	}
}