import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String S[] = s.split(" ");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print(S[i].substring(0, 1));
		}
		System.out.println();
	}
}
