import java.util.Scanner;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		System.out.println((int)(Math.log(B / A) / Math.log(2) + 1));
	}
}
