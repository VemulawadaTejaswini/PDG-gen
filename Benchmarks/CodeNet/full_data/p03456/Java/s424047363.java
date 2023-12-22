import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		int ab;
		a = sc.next();
		b = sc.next();
		ab = Integer.parseInt(a + b);

		int i = 0;
		boolean flg = false;
		while(i * i <= ab) {
			if(i * i == ab) {
				flg = true;
				break;
			} else {
				flg = false;
			}

			i++;
		}

		System.out.print(flg == true ? "Yes" : "No");
	}
}