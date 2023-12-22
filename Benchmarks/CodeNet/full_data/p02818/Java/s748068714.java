import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();
		scan.close();
		if(k-a>0)System.out.println("0 "+ Math.abs(k-a-b));
		else System.out.println(a-k+" "+ b);

	}

}