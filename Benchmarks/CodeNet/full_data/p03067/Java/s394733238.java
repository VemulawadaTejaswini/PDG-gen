import java.util.Scanner;
//A問題
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a < c && c < b || b < c && c < a)
			System.out.print("Yes");
		else System.out.print("No");

		s.close();
		}

}