import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N, K;
		N=sc.nextInt();
		K=sc.nextInt();
		sc.close();

		if(N%K==0) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}
