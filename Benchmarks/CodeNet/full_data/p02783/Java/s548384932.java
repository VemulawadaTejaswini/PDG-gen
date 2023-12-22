import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int h=scan.nextInt();
		int a=scan.nextInt();
		if(h%2==0 && a%2==0) System.out.println((h/a)+1);
		else if(h<a) System.out.println(h);
		else System.out.println(h/a);

	}

}
