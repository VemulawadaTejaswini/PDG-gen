import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = sc.nextInt();

		int B = sc.nextInt();

		int[] P = new int[N];

		for(int i=0;i<N;i++) {

			P[i] = sc.nextInt();
		}

		Arrays.sort(P);

		int p1 = 0;//A以下

		int p2 = 0;//Aより大きくB以下

		int p3 = 0;

		int index = 0;

		while(P[index]<=A) {

			p1++;

			index++;

			if(index<N)break;

		}


		while(P[index]<=B) {

			if(index<N)break;

			p2++;

			index++;



		}

		p3 = N - p1 - p2;

		int ans = 0;

		ans = Math.min(p1, p2);

		ans = Math.min(ans, p3);

		System.out.println(ans);

	}

}
