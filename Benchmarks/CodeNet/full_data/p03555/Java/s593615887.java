import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		sb.reverse();
		if(sc.next().equals(sb.toString())) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}