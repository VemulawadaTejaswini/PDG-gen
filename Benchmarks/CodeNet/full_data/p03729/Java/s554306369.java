import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next(),c=sc.next();
		System.out.println((a.charAt(a.length()-1)==b.charAt(0)&&b.charAt(b.length()-1)==c.charAt(0))?"YES":"NO");
		sc.close();
	}
}