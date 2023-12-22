import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long W = scn.nextLong(), H = scn.nextLong();
		long x = scn.nextLong(), y = scn.nextLong();
		double ans = (double)(W*H)/2;
		System.out.println(ans + " " + ((2*x==W && 2*y == H)?1:0));
	}

}
