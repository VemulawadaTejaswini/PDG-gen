import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b=scan.nextInt();
		String a=scan.next();
		int c=scan.nextInt();
		if(a.equals("+")) {
			System.out.println(b+c);
		}
		else {
			System.out.println(b-c);
		}
	}
	}