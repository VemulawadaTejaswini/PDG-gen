import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int X[][] = new int[N][D];

		for (int i=0; i<N; i++){
			for (int j=0; j<D; j++){
				X[i][j] = sc.nextInt();
			}
		}
		int cnt = 0;
		for (int i=0; i<N; i++){
			for (int j=i+1; j<N; j++){
				int tmp=0;
				double sqrt;
				for (int k=0; k<D; k++){
					tmp += Math.pow((X[i][k] - X[j][k]),2);
				}
				sqrt = Math.sqrt(tmp);
				if (Math.floor(sqrt) == sqrt){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}


}