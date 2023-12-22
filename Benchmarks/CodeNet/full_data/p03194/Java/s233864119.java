import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		long N = sc.nextLong();

		long P = sc.nextLong();

		long ans = 1L;

		long i = 2;

		boolean flag = false;

		long count = 0;

		//素因数分解
		while(P!=1) {

			flag = false;

			count = 0;

			for(long j=2;j*j<=i;j++) {

				if(i%j==0) {

					flag = true;

					break;

				}

				if(i%(i-j+1)==0) {

					flag = true;

					break;
				}
			}

			while(flag==false && P%i==0) {

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
