import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		List<Integer> hs = Arrays.asList( scanner.nextLine().split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());
		
		int count = 0;
		for(int h : hs) {
			if(h >= k) {
				count++;
			}
		}
		System.out.println(k);
	}
}
