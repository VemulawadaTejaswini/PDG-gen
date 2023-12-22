import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s1=reader.nextLine();
		String s2=reader.nextLine();
		int cont=0;
		if(s1.charAt(0) == s2.charAt(0))
				++cont;
		if(s1.charAt(1) == s2.charAt(1))
			++cont;
		if(s1.charAt(2) == s2.charAt(2))
			++cont;
		System.out.println(cont);
	}

}
