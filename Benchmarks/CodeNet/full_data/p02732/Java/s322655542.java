import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		long[] b=new int[n];
		long sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[a[i]-1]++;
		}
		for(int j=0;j<n;j++) {
			sum+=b[j]*(b[j]-1)/2;
		}
		for(int i=0;i<n;i++) {
			System.out.println(sum-(b[a[i]-1]-1));
		}
	}
}
