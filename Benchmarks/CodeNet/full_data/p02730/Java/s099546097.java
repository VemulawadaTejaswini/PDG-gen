import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String revs = "";

		int n = s.length();

		if(n % 2 == 1) {
			for(int i = 0;i<n;i++) {
				revs = revs + s.substring(((n-i)-1),n-i);
			}
				if(s.equals(revs)) {
				System.out.println("Yes");
			}else {
			System.out.println("No");
			}


		}else {
			System.out.println(-1);
		}
		scan.close();
	}

}