import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			X[i] = sc.nextInt();
			if(X[i]>=max)
				max = X[i];
		}
		sc.close();
		int ene;
		int E = 1000000;
		for(int i=0; i<max; i++) {
			ene = 0;
			for(int j=0; j<N; j++) {
				ene+=Math.abs(X[j]-i)*Math.abs(X[j]-i);
			}
			E = Integer.min(ene,E);
		}
		System.out.println(E);
	}

}