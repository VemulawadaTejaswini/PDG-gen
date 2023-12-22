import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();
		String S1 = S.substring(0, 2);
		String S2 = S.substring(2, 4);

		if(isMM(S1)){
			if(isMM(S2)) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if(isMM(S2)) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}


	}
	public static boolean isMM(String S) {
		int month = Integer.parseInt(S);
		if (month>=1&&month<=12) {
			return true;
		} else {
			return false;
		}
	}
}