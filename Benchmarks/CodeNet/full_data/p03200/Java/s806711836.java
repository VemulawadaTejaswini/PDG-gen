import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			char[]s = S.toCharArray();



			int count = 0;
			int kosuu = 0;
			for(int i = s.length-1;i>=0;i--) {

				int youso = s.length-1;
				if(s[i]=='B') {
					count+=youso-i-kosuu;
					kosuu++;
				}
			}

			System.out.println(count);

		}


	}


}
