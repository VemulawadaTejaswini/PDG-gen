import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int masu[][] = new int[3][3];
		String line1[] = sc.nextLine().split(" ");
		String line2[] = sc.nextLine().split(" ");
		String line3[] = sc.nextLine().split(" ");
		int intline1[] = new int[3];
		int intline2[] = new int[3];
		int intline3[] = new int[3];
		for (int i = 0; i < 3; i++) {
			intline1[i] = Integer.parseInt(line1[i]);
			intline2[i] = Integer.parseInt(line2[i]);
			intline3[i] = Integer.parseInt(line3[i]);
		}
		boolean tate = intline1[0] - intline2[0] == intline1[1] - intline2[1] &&
				intline1[1] - intline2[1] == intline1[2] - intline2[2];
		boolean yoko = intline1[0] - intline1[1] == intline2[0] - intline2[1] &&
				intline2[0] - intline2[1] == intline3[0] - intline3[1];
		if(tate && yoko) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}