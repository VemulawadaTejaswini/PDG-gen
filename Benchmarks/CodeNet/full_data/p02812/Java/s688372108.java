import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "";
		s = sc.next();
		int len = s.length();
		String[] ar = s.split("");
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (ar[i].equals("A") == true) {
				i++;
				if (ar[i].equals("B") == true) {
					i++;
					if (ar[i].equals("C") == true) {
						count++;
					} else {
						i--;
					}
				} else {
					i--;
				}
			}
		}
		System.out.println(count);
	}

}
