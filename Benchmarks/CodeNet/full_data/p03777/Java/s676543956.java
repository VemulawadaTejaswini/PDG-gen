import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a=scan.next().charAt(0);
		char b=scan.next().charAt(0);
		scan.close();
		if(a=='H') {
			if(b=='H')System.out.println(a);
			else System.out.println(b);
		}else {
			if(b=='H')System.out.println(a);
			else System.out.println(b);
		}

	}
}
