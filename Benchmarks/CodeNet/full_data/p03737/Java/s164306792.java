import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		sb.append(sc.next().substring(0, 1));
		sb.append(sc.next().substring(0, 1));
		sb.append(sc.next().substring(0, 1));
		
		System.out.println(sb.toString().toUpperCase());
	}
}
