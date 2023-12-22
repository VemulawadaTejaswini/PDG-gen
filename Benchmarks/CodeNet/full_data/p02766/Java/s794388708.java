import java.util.Scanner;

//public class atcoder0221_B{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int result2 = N;
		int result = 0;

		do {
			result2=result2/K;
			result++;
		}while(result2!=0);

		System.out.println(result);
	}
}