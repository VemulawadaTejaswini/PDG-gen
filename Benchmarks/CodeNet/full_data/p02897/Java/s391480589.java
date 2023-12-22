import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N / 2;
		int b = N - a;

		double ans = (double)b / (double)N;

		System.out.println(ans);
	}
}
