import java.util.Scanner;

//public class atcoder0221_B{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int result = H*W/2;
		if(H*W%2==1) {
			result++;
		}
		System.out.println(result);
	}
}