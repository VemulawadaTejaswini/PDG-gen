import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		int N = cin.nextInt();
		int M = cin.nextInt();
		
		
		int ans = N*(N-1)/2+M*(M-1)/2;
		

		System.out.println(ans);
	}

}
