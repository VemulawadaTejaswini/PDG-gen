import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		String s = sc.next();
		// ３文字確定だからAAAかBBBの二択なはず
		if(s.matches("AAA") || s.matches("BBB")) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}