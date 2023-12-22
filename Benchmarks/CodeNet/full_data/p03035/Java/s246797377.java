import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(13<=a) {
			System.out.println(b);
		}else if(6<=a) {
			System.out.println(b/2);
		}else {
			System.out.println(0);
		}
	}
}