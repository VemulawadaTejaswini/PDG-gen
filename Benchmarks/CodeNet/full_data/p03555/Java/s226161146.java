import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine().trim();
		String in2 = sc.nextLine().trim();

		char[] inArray = in2.toCharArray();
		int len = in2.length() -1;
		StringBuffer revBuf = new StringBuffer();
		for (int i = len  ; i >= 0 ;i-- ) {
			revBuf.append(Character.toString(inArray[i]));
		}
		if (in1.equals(revBuf.toString())){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}