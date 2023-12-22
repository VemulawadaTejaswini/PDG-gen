import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] cset = s.toCharArray();
		for(int i = 0; i < cset.length; i++) {
			if(cset[i] != '1') {
				System.out.println(cset[i]);
				return;
			}
		}
	}

}
