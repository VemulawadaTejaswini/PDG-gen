import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int $1 = 0;
		int $2 = 0;
		int $4 = 0;
		for(int i = 0; i < n; i++) {
			long l = sc.nextLong();
			if(l % 4 == 0) {
				$4++;
			} else if(l % 2 == 0) {
				$2++;
			} else {
				$1++;
			}
		}
		if($2 != 0) $1++;
		System.out.println($1-1 <= $4 ? "Yes" : "No");
	}
}