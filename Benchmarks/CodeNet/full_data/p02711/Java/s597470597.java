import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] n = scanner.next().split("");
		List<Boolean> result = new ArrayList<>();
		
		scanner.close();
		
		for (int i = 0; i < n.length; i++) {
			
			if ("7".equals(n[i])) {
				result.add(true);
			} else 
				result.add(false);
		}
		
		if (result.stream().anyMatch(e -> e == true)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
