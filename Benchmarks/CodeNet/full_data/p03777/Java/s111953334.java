import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a=scan.next().charAt(0);
		char b=scan.next().charAt(0);
		if(a=='H' && b!='D') System.out.println("H");
		else if(b=='H' && a!='D') System.out.println("H");
		else if(a=='D' && b=='D') System.out.println("H");
		else System.out.println("D");
	}

}
