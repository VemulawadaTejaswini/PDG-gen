import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int L = S.length();
		int Ucount = 0;
		int Ccount = 0;

		for(int i=0; i<L; i++) {
			if(Character.isUpperCase(S.charAt(i))){
				Ucount += 1;
			}
		}

		for(int j=2; j<L-1; j++) {
			if(S.charAt(j) == 'C') {
				Ccount += 1;
			}
		}

		if(Ucount == 2 && Ccount ==1) {
			if(S.charAt(0) == 'A') {
				System.out.println("AC");
			}else {
				System.out.println("WA");
			}
		}else {
			System.out.println("WA");
		}

	}

}
