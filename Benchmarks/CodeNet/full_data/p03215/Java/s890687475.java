import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		int[] a = new int[N];

		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

		}

		int sum = 0;



			int k = K/2;

			int b = 0;

			int c = 0;


			for(int i=0;i<N-k;i++) {

				b += a[i];

				c += a[i+k];

			}

			if(K%2==0) {

				if(b>c) System.out.println(b);

				else System.out.println(c);

			}else {

				if(b>c) System.out.println(c);

				else System.out.println(b);
			}


	}

}
