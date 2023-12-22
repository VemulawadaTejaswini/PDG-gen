import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();


		int ans = 0;

		int m = N/K;

		ans += Math.pow(m, 3);

		if(K%2==0) {

			int mm = 0;

			/*for(int i=K/2;i<=N;i+=K) {

				mm++;

			}*/

			if(m*K+(K/2)>N) mm = m;

			else mm = m+1;



			ans += Math.pow(mm, 3);
		}

		System.out.println(ans);

	}



}
