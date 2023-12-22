import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(),w = scan.nextInt();
		String[] C = new String[h];
		for(int i=0; i<h; i++)C[i] = scan.next();
		for(String c :C)System.out.println(c+"\n"+c);

	}

}