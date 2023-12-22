import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		List<Integer> as = Arrays.asList( scanner.nextLine().split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());
		
		for(int i = 0; i < n; i++) {
			int idx = as.indexOf(i + 1);
			System.out.print(idx + 1);
			if(i < n - 1) {
				System.out.print(" ");
			}
		}
	}
}