import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = 0;
		int B = 0;
		String S = scan.next();
		String[] str = S.split("");
		for(int i = 0; i < S.length(); i++) {
			if(str[i].equals("A")) {
				A = i;
				break;
			}
		}
		for(int j = S.length()-1; j > 0; j--) {
			if(str[j].equals("Z")) {
				B = j;
				break;
			}
		}
		System.out.println(B - A + 1);
		scan.close();
	}
}
