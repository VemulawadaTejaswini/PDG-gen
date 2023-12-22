
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] Q=new int[N+1];
		for(int i=1; i<=N ; i++) {
			Q[sc.nextInt()]=i;
		}
		int R=0;
		int i=1;
		while(Q[i]<Q[i+1] && i<N) {
			i++;
		}
		R=i;

		int L=0;
		i=N;
		while(Q[i-1]<Q[i] && i>1) {
			i--;
		}
		L=N+1-i;

		System.out.println(Math.min(N-R,N-L));
	}
}