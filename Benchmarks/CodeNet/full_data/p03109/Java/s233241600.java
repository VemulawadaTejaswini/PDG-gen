import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next().replaceAll("/", ""));
		if(s > 20190430) System.out.println("TBD");
		else System.out.println("Heisei");
	}
}
