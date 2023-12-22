import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int ans=0;

		int max=0;

		for(int i=0;i<N;i++) {

			int now=sc.nextInt();

			if(max<=now) ans++;

			if(max<now) max=now;

		}

		System.out.println(ans);

		sc.close();

	}

}
