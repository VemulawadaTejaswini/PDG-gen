import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		int[] d = new int[N];
		int sum = 0;

		for(int i=0; i<N ; i++) {
			V[i] = sc.nextInt();
		}

		//System.out.println(N);
		//System.out.println(V[0]+" "+V[N-1]);

		for(int i=0; i<N ; i++) {
			C[i] = sc.nextInt();
		}

		//System.out.println(sum);
		//System.out.println(C[0]+" "+C[N-1]);

		for(int i=0; i<N ; i++) {
			int di = V[i] - C[i];
			if(di > 0) {
				d[i] = di;
			}else {
				d[i] = 0;
			}
		}

		for(int i=0; i<N; i++) {
			sum += d[i];
		}

		System.out.println(sum);


	}

}
