import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		String inputS = sc.next();
		String[] S = inputS.split("");
		sc.close();

		//Logic
		String B = S[0]+S[1];
		int b1 = Integer.parseInt(B);

		B = S[2]+S[3];
		int b2 = Integer.parseInt(B);

		boolean IsYYMM = true;
		boolean IsMMYY = true;

		if(!(1 <= b1 && b1 <= 12)) {
			IsMMYY = false;
		}

		if(!(1 <= b2 && b2 <= 12)) {
			IsYYMM = false;
		}

		if(b1 == 0) {
			IsMMYY = false;
		}

		if(b2 == 0) {
			IsYYMM = false;
		}

		if(IsYYMM && IsMMYY) {
			System.out.print("AMBIGUOUS");
		}else if(IsYYMM) {
			System.out.print("YYMM");
		}else if(IsMMYY) {
			System.out.print("MMYY");
		}else {
			System.out.print("NA");
		}

	}

}
