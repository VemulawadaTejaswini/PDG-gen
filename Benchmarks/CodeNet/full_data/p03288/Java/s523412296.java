import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		if(r >= 2800) System.out.println("AGC");
		else if(r >= 1200) System.out.println("ARC");
		else System.out.println("ABC");
	}
}