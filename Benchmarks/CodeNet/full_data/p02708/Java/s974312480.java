import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long K = sc.nextInt();
		long ans = 0;
		long nSum = (N+1)*N/2+1;

		for(long k = K; k<=N+1; k++) {
			ans+=((2*N+1-k)*k/2-(k-1)*k/2+1);
			ans%=Math.pow(10,9)+7;
//			System.out.println(ans);
		}

		ans%=Math.pow(10,9)+7;

		System.out.println(ans);


	}