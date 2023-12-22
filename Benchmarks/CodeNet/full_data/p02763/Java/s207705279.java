import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s[] = scan.next().split("");
		int q = scan.nextInt();
		for(int k = 0 ; k < q ; k++) {
			if(scan.nextInt() == 1) {
				int i = scan.nextInt();
				s[i-1] = scan.next();

			}else {
				int l = scan.nextInt();
				int r = scan.nextInt();
				List<String> list = Arrays.asList(Arrays.copyOfRange(s , l-1 , r));
				System.out.println(new HashSet<>(list).size());
			}
		}

	}
}
