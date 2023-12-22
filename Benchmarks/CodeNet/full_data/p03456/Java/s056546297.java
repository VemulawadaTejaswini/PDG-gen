import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ab = Integer.parseInt(sc.next()+sc.next());
		int c = (int)Math.sqrt(ab);
		if(c*c == ab) System.out.println("Yes");
		else System.out.println("No");
	}
}
