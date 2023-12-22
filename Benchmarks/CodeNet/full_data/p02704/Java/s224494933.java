import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S[] = new int[N];
		int T[] = new int[N];
		BigInteger U[] = new BigInteger[N];
		BigInteger V[] = new BigInteger[N];
		for (int i=0;i<N;i++) {
			S[i] = sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			T[i] = sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			U[i] = new BigInteger(sc.next().getBytes());
		}
		for (int i=0;i<N;i++) {
			V[i] = new BigInteger(sc.next().getBytes());
		}
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if ((S[i]==0&&T[j]==1)) {
					BigInteger temp = U[i].and(V[j]);
					if(temp.compareTo(V[j])<0) {
						System.out.println(-1);
						return;
					}
				} else 	if ((S[i]==1&&T[j]==0)) {
					BigInteger temp = U[i].and(V[j]);
					if(temp.compareTo(U[i])<0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				
			}
		}
	}
}