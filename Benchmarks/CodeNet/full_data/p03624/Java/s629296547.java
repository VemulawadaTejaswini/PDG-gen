import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		char a = 'a';
		while (s.indexOf(String.valueOf(a)) != -1)
			a++;
		System.out.println((a <= 'z')? a : "None");
	}
}