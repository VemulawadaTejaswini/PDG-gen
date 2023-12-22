import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();


		for (int i = 0; i < q; i++) {
			//System.out.println("q=" + i);
			int count = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();
			String t = s.substring(l - 1, r);
			//System.out.println(t);
			for (int j = 0; j < t.length() - 1; j++) {
				if (String.valueOf(t.charAt(j)).equals("A")) {
					if (String.valueOf(t.charAt(j + 1)).equals("C")) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

