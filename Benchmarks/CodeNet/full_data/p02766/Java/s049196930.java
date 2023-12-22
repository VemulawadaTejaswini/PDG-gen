import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong()+1;
		int k = sc.nextInt();
		System.out.println((int)(Math.ceil(Math.log(n)/Math.log(k))));				

	}

}
