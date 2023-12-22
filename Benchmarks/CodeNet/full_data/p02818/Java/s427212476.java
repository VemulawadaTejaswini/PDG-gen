import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();

		long aa;
		if(k > a) {
			aa = 0;
		}else {
			aa = a - k;
		}

		long bb;
		if(k - a > b) {
			bb = 0;
		}else {
			bb = b - (k - a);
		}

		System.out.println(aa + " " + bb);
	}
}