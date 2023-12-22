import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int N = n / 111;
		if(n % 111 != 0)
			N += 1;
		
		System.out.println(N * 111);
	}

}
