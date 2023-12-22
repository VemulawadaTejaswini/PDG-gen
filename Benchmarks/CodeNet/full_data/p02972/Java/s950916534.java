import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A = new int[N+1];

		for (int i=1; i<=N; i++){
			A[i] = sc.nextInt();
		}

		int Ans[] = new int[N+1];
		int AnsCnt=0;
		for (int i=N; i>0; i--){
			int tmp=0;
			for (int j=i*2; j<=N; j=j+i){
				tmp += Ans[j];
			}
			if ((tmp % 2) != A[i]){
				Ans[i] = 1;
				AnsCnt++;
			}
		}
		System.out.println(AnsCnt);
		for (int i=1; i<Ans.length; i++){
			if (Ans[i] == 1){
				System.out.println(i);
			}
		}
	}


}