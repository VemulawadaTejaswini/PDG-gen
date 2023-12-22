import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		double bunsuu[] = new double[N];
		double ans = 0;
		double kobai = 0;

		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			kobai += 1/(double)A[i];
		}

		ans = 1 /kobai;




		System.out.println(ans);
	}

}
