import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		StringBuilder sb=new StringBuilder(s);
		String sf=sb.reverse().toString();
		char[] ch=sf.toCharArray();
		for (char c:ch) {
			if (c=='b') {
				c='d';
			}
			if (c=='d') {
				c='b';
			}
			if (c=='p') {
				c='q';
			}
			if (c=='q') {
				c='p';
			}
		}
		String s1=String.valueOf(ch);
		if (s1.equals(s)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}