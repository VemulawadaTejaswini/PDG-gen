import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		String s = new Scanner(System.in).nextLine();
		for (int i = 0; i < q; i++) {
			Scanner an = new Scanner(System.in);
			int a = an.nextInt(), b = an.nextInt();
            String s2 = s.substring(a,b);
			System.out.println(s2.count("AC"));
		}
	}
}