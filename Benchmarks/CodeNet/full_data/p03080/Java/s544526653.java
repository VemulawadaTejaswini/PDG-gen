
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int personNum = Integer.parseInt(sc.nextLine());
		List<String> elements = Arrays.asList(sc.nextLine().split(""));
		
		long red_count = elements.stream().filter( s -> s.contentEquals(s) ).count();
		
		String result = (personNum+1)/2 <= red_count ? "Yes" : "No";
		System.out.println(result);
		sc.close();
	}
}