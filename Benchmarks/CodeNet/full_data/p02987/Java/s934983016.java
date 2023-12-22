import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		char[] targ = s.toCharArray();
		
		char temp1 = targ[0];
		int cnt1 = 0;
		for(int i = 0; i<4; i++) {
			if(targ[i] == temp1) cnt1++;
		}
		
		if(cnt1 != 2) {
			System.out.println("No");
			return;
		}
		

		char temp2 = temp1;
		int cnt2 = 0;
		for(int i = 0; i<4; i++) {
			if(targ[i] != temp1) {
				temp2 = targ[i];
				break;
			}
		}
		
		if(temp2 == temp1) {
			System.out.println("No");
			return;
		}
		
		for(int i = 0; i<4; i++) {
			if(targ[i] == temp2) cnt2++;
		}
		
		if(cnt2 != 2) {
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
		in.close();
	}
}
