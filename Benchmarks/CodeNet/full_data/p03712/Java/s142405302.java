import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] hw = sc.nextLine().split(" ");
		int h = Integer.parseInt(hw[0]) + 1;
		int w = Integer.parseInt(hw[1]) + 2;

		for (int i = 0; i <= h; i++) {
			if (i == 0 || i == h) {
				System.out.println(new String(new char[w]).replace("\0", "#"));
			}else {
				System.out.println("#" + sc.nextLine() + "#");
			}
		}
	}
}
