import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		switch(D) {
		case 0:
			ans = N;
			break;
		case 1:
			ans = 100 * N;
			break;
		case 2:
			ans = 100 * 100 * N;
			break;

		}
		System.out.println(ans);
	}
}