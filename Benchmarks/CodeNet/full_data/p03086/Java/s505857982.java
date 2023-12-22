import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		int con = 0;
		int ans = 0;
		for (int i = 0; i < line.length(); i++) {
			char cut = line.charAt(i);
			if (cut == 'A' || cut == 'C' || cut == 'G' || cut == 'T') {
				con++;
			}else {
				if (ans < con ) {
					ans = con;
					con = 0;
				}
			}
		}
		if (ans < con ) {
			ans = con;
			con = 0;
		}

		System.out.println(ans);

	}
}
