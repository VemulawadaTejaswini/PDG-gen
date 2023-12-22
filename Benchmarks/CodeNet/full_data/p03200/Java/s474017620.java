import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		long count=0;
		int whc=0;
		int blc=0;
		char[] str=S.toCharArray();
		for(int i=0;i<S.length();i++) {
			if(str[i]=='B') {
				blc++;
			} else {
				count+=blc;
				whc++;
			}
		}
		System.out.println(count);

	}

}
