import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		for (int i=1;i<4;i++) {
			if (s[i]==s[i-1]) {
				System.out.println("Bad");
				return ;
			}
		}

		System.out.println("Good");

	}

}
