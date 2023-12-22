import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long count = 0;

		count = A*(N/(A+B));
		if(N%(A+B)>=A) {
			count = count + A;
		}else {
			count = count + N%(A+B);
		}
		System.out.println(count);
	}
}