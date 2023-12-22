import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Nsc = sc.nextInt();
		int anscnt = 0;
		for(int j = 1; j <= Nsc; j++) {
		int N = j;

		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				cnt ++;
			}
		}
		//int ans = 0;
		if(N % 2 ==1) {
		if(cnt == 8) {
			//ans = 1;
			anscnt ++;
			//System.out.println(j+":"+ans);
		}
		}
		}
		System.out.println(anscnt);
		sc.close();

	}

}
