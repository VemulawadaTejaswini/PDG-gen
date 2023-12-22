
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s = new Scanner(System.in);
		ch = s.next().charAt(0);
		int i = (int)ch + 1;
		ch = (char)i;
		PrintStream p = new PrintStream(System.out);  
		p.print(ch);
	}
}