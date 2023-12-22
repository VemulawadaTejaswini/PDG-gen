import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i]=='1') {
				if(i==k) {
					System.out.println("1");
					break;
				}
			}
			else {
				System.out.println(c[i]);
				break;
			}
		}
	}
}