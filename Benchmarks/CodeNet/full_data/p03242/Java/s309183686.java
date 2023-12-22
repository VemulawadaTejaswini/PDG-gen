import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strN = scan.next();
		char[] nArray = strN.toCharArray();
		for (int i=0;i<nArray.length;i++) {
			if (nArray[i] == '1') {
				nArray[i] = '9';
			} else {
				nArray[i] = '1';
			}
		}
		strN="";
		for (char c : nArray) {
			strN+=c;
		}
		System.out.println(strN);
	}
}
