import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		int c = Integer.parseInt(s.next());
		s.close();

		int min = a+b;
		if(b+c < min) min = b+c;
		if(a+c < min) min = a+c;

		System.out.println(min);
	}

}