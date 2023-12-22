import java.util.Scanner;

//public class atcoder0221_A{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		//
		result = N/2;
		if(N%2==1)result++;
		System.out.println(result);
	}
}