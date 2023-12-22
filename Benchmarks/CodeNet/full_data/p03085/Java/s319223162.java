import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		if(c=='A') System.out.println("T");
		else if(c=='T') System.out.println("A");
		else if(c=='G') System.out.println("C");
		else System.out.println("G");

	}

}
