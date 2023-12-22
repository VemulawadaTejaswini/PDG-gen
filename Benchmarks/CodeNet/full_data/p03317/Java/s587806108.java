import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N % K == 0)
			System.out.println((N-1)/(K-1));
		else
			System.out.println((N-1)/(K-1)+1);
	}

}