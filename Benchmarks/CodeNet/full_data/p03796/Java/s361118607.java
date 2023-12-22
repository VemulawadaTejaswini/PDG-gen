import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long result=1;
		for(int i=1;i<=N;i++) {
			result =result * i % 1000000007;
		}
		System.out.print(result);
	}

}