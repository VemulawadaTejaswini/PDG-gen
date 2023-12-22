import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int mod = N % K;
		if(K - mod > mod)
			System.out.println(mod);
		else
			System.out.println((K-mod));
		sc.close();
	}
}
