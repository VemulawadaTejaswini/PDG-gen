import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String komoji=scan.next();
		char  a=komoji.charAt(0);
		a += 1;
		System.out.println(a);
	}
}
