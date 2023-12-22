import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		ArrayList<String> v = new ArrayList<String>();
		v.add("a"); v.add("i");v.add("u");v.add("e");v.add("o");
		System.out.println((v.contains(c))? "vowel":"consonant");
	}

}