import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		System.out.print(str.substring(0,5)+" "+str.substring(6,13)+" "+str.substring(14,19));
	}
}