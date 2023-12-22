import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(Math.min(a, b));
	}
}