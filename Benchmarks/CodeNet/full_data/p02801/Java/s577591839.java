import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner lector=new Scanner (System.in);
		String a= lector.nextLine();
		char s= a.charAt(0);
		s=(char) (s+1);
		System.out.print (s);
	}
}
