import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[]= new int[N];
		double b[] = new double[N];
		int max=0;
		int sum =0;
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0;i<K;i++) {
			max+=a[i];
		}
		sum =max;
		for (int i=K;i<N;i++) {
			sum = a[i]+sum-a[i-K];
			if (sum >max) {
				max = sum;
			}
		}
		double d = max+K;
		System.out.println(d/(double)2);
	}
}
