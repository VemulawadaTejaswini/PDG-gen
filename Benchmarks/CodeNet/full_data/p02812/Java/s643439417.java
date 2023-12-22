import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C') {
				count += 1;
			}
		}
		System.out.println(count);
		kb.close();
	}

}
