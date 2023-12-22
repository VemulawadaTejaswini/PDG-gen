import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		s = s.replace(" ", "");
		int k = Integer.parseInt(s);
		if(k % 4 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}