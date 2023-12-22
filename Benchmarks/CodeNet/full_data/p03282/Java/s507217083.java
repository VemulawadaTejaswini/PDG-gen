import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		long k = sc.nextLong();
		
		if(k == 1) {
			System.out.println(s[0]);
		}
		if(k >= 2) {
			if(s[0] != '1') {
				System.out.println(s[0]);
			}
			if(s[0] == '1') {
				System.out.println(s[1]);
			}
		}

	}

}
