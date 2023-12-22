import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(),b = sc.next();
		if(a.equals("D") && b.equals("H")) System.out.println("D");
		else System.out.println("H");
	}
}