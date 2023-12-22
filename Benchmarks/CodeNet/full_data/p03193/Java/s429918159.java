import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int H = sc.nextInt();

		int W = sc.nextInt();

		int ans = 0;


		for(int i=0;i<N;i++) {

			int a = sc.nextInt();

			int b = sc.nextInt();

			if(a>=H && b>=W) ans++;
		}

		System.out.println(ans);

	}

}
