import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		int i = 0;
		int j = 0;


		String[] ary2 = new String[h];

		for (i = 0; i<h; i++) {
			String str = s.next();
			ary2[i] = str;
			System.out.println(ary2[i]);
			System.out.println(ary2[i]);


		}


	}
}