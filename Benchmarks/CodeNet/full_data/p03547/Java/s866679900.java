import java.util.Scanner;
public class Main{
	public static int string(String i) {
		int j=0;
		if(i.equals("A")) {
			j=10;
		}if(i.equals("B")) {
			j=11;
		}if(i.equals("C")) {
			j=12;
		}if(i.equals("D")) {
			j=13;
		}if(i.equals("E")) {
			j=14;
		}if(i.equals("F")) {
			j=15;
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		int c=string(a);
		int d=string(b);
		if(c==d) {
			System.out.println("=");
		}
		else {
			if(c>d) {
				System.out.println(">");
			}
			else {
				System.out.println("<");
			}
		}
	}
}