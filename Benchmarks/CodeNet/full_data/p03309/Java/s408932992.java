import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		int sum = 0;


		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

			sum += a[i] -(i+1);
		}

		int b = sum/N;

		int c = 0;

		if(b<=0) {

			c = b-1;
		}else {

			c = b+1;
		}


		int ansB = 0;

		int ansC = 0;

		int d = 0;

		for(int i=0;i<N;i++) {

			d = Math.abs(a[i]-((i+1)+b));

			ansB += d;
		}

		for(int i=0;i<N;i++) {

			d = Math.abs(a[i]-((i+1)+c));

			ansC += d;
		}

		System.out.println(Math.min(ansB, ansC));
	}
}
