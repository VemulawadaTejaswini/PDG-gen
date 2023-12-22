import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] X = new int[N];

		for(int i=0;i<N;i++) {
			X[i]=sc.nextInt();
		}
		Arrays.sort(X);

		int min=Integer.MAX_VALUE;
		for(int i=0;i<=X[N-1]+10;i++) {
			int d=0;
			for(int j=0;j<N;j++) {
				d+=(X[j]-i)*(X[j]-i);
			}
			if(d<min) {
				min=d;
			}
		}
		System.out.println(min);
	}
}
