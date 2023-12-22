import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		String g = sc.nextLine();
		String b = sc.nextLine();
		String rgb = r + g + b;
		int changeRGB = Integer.parseInt(rgb);
		if(changeRGB % 4 == 0) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
