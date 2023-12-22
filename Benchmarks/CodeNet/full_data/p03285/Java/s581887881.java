import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			int A = N/4;
			int B = N/7;
			int C = N/28;
			int sum = A+B-C;
			System.out.println(sum);
			
			
	}

}

