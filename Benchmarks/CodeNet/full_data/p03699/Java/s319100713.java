import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		Arrays.sort(a);
		if(sum%10!=0) {
			System.out.println(sum);
			System.exit(0);
		}else {
			for(int i=0;i<n;i++) {
				if((sum-a[i])%10!=0) {
					System.out.println(sum-a[i]);
					System.exit(0);
				}
			}
		}
		System.out.println(0);
	}
}
