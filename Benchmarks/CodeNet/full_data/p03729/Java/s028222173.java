import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		String c = scan.next();

		char ss1F = a.charAt(0);
		char ss2F = b.charAt(0);
		char ss3F = c.charAt(0);

		char ss1L = a.charAt(a.length()-1);
		char ss2L = b.charAt(b.length()-1);
		char ss3L = c.charAt(c.length()-1);

		String s1F = String.valueOf(ss1F);
		String s2F = String.valueOf(ss2F);
		String s3F = String.valueOf(ss3F);

		String s1L = String.valueOf(ss1L);
		String s2L = String.valueOf(ss2L);
		String s3L = String.valueOf(ss3L);

		int x =1;
		int y =11;
		if(x<a.length() && a.length()<y && x<b.length() && b.length()<y && x<c.length() && c.length()<y && s1L.equalsIgnoreCase(s2F) && s2L.equalsIgnoreCase(s3F)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}