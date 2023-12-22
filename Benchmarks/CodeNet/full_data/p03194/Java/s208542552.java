import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		long N = sc.nextLong();

		long P = sc.nextLong();

		long ans = 1L;

		long i = 2;

		boolean flag = false;

		long count = 0;


		while(P!=1) {

			count = 0;

			while(P%i==0) {

				P /= i;

				count++;

			}


			if(count/N!=0) {

				ans *= (count/N)*i;
			}

			i++;
		}

		System.out.println(ans);

	}

}
