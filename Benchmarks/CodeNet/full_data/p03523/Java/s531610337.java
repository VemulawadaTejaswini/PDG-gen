import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String akihabara = "AKIHABARA";
		String s = scanner.nextLine();

		int i;
		int j = 0;
		for(i = 0; i < s.length(); i++){
			if(
				j+1 < akihabara.length() &&
				akihabara.charAt(j)=='A' &&
				akihabara.charAt(j) != s.charAt(i)
			) {
				j++;
			}

			if(j == akihabara.length() || akihabara.charAt(j) != s.charAt(i)) {
				System.out.println("NO");
				return;
			}
			j++;
		}
		System.out.println("YES");
	}
}
