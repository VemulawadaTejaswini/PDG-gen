import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = Long.parseLong(sc.next());
		long b = 0;
		for (long i = 1; i <= k; i++) {
			long c = 0;
			if (i < 10)
				c = i;
			else if (i < 28){
				boolean e = false;
				for (int j = 0; j < String.valueOf(b).length(); j++) {
					if (b / (long)Math.pow(10, j) % 10 != 9) {
						c = b + (long)Math.pow(10, j);
						e = true;
						break;
					}
				}
				if (!e)
					c = b + (long)Math.pow(10,String.valueOf(b).length());
			}
			else {
				boolean e = false;
				for (int j = 0; j < String.valueOf(b).length(); j++) {
					if (b / (long)Math.pow(10, j) % 10 != 9) {
						c = b + (long)Math.pow(10, j);
						e = true;
						break;
					}
				}
				if (!e)
					c = b + (long)Math.pow(10,String.valueOf(b).length() - 1);
			}
			System.out.println(c);
			b = c;
		}
	}
}