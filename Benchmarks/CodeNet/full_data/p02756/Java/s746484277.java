import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long q = scan.nextLong();

		for(long i = 0;i<q;i++) {
			int ti = scan.nextInt();
			if(ti == 1) {
				char s_char[] = s.toCharArray();
				char tmp = s_char[0];
				s_char[0] = s_char[s.length()-1];
				s_char[s.length()-1] = tmp;
				s = String.valueOf(s_char);
			}else {
				int fi = scan.nextInt();
				String ci = scan.next();
				if(fi == 1) s = ci + s;
				else s = s + ci;
			}
		}
		scan.close();

		System.out.println(s);
	}
}