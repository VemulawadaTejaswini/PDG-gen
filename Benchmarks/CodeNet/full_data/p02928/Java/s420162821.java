import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		final long mod = 1000000007;
		int[] array = new int[n];
		for(int i=0;i<n;i++) array[i]=sc.nextInt();
		sc.close();
		long count=0, temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]>array[j]) count++;
			}
		}
		count*=k;
		count%=mod;
		Arrays.sort(array);
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]<array[j]) {
					temp++;
				}
			}
		}
		long sum2 = temp * (((long)k * (long)(k-1))/2);
		long sum = (count+sum2)%mod;
		System.out.println(sum);
	}
}
