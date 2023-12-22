import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String r=s.next(),buf=r;
		while(r!=(buf=r.replaceAll("ST", ""))) {
			r=buf;
		}
		System.out.println(r);
	}
}
