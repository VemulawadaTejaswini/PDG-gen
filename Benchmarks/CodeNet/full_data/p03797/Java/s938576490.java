import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long c = sc.nextLong();
		if(2 * s >= c) System.out.println(c/2);
		else {
			long c2 = c - (2 * s);
			System.out.println(s + c2 / 4);
		}
	}
}
