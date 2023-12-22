import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s,t,u;
		int a,b;
		Scanner scanner = new Scanner(System.in);

		s = scanner.next();
		t = scanner.next();
		a = scanner.nextInt();
		b = scanner.nextInt();

		u = scanner.next();

		if (s.equals(u)){
			a--;
		}else {
			b--;
		}

		System.out.println(a + " " + b);
	}

}