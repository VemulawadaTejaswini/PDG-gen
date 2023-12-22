import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		Integer[] a = new Integer[(3*N)-1];
		for(int i = 0;i<(3*N)-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int b= N;b<N+N;b++) {
			sum = a[b]+sum;
		}
		if(a[N-2]!=N) {
		sum = sum + (a[((a[N-2]))+N+N-1]);
		System.out.println(sum);
		}
		else {
			sum = sum+a[2*N-1];
			System.out.println(sum);
		}
	}
}
