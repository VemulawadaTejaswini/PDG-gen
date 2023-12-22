import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		/* 一文字目がAかつ3-末尾から2文字目にCが1つ。ほかは小文字。 */
		if (s.matches("A[a-z]+C[a-z]+")) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}