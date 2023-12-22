import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		char c = sc.next().charAt(0);

		System.out.println(String.valueOf(a).toUpperCase()+String.valueOf(b)+String.valueOf(c).toUpperCase());

	}
}
