import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int n = s.length();
		boolean fumiyasui = true;
		for(int i=0;i<n;i++) {
			char step = s.charAt(i);
			if(i%2 == 1) {
				if((step == 'L')||(step == 'U' || (step == 'D')));
				else fumiyasui = false;
			}else {
				if((step == 'R')||(step == 'U' || (step == 'D')));
				else fumiyasui = false;
			}
		}

		if(fumiyasui) System.out.println("Yes");
		else System.out.println("No");

	}
}
