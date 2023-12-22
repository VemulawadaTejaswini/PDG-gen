import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String S = in.nextLine();
		char[] chars = S.toCharArray();
		
		char c0 = chars[0];
		char c1 = chars[1];
		char c2 = chars[2];
		char c3 = chars[3];
		
		if(c0==c1&&c2==c3&&c0!=c2) {
			System.out.println("Yes");
		}else if(c0==c2&&c1==c3&&c0!=c1) {
			System.out.println("Yes");
		}else if(c0==c3&&c1==c2&&c0!=c1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		in.close();
	}
}
