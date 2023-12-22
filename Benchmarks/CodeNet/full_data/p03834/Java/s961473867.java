import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		s = s.replace(",", " ");
		System.out.println(s);
		sc.close();
	}
}
