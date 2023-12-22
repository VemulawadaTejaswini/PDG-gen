import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Boolean> blue = new ArrayList<>();
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			blue.add(false);
			if(str.charAt(i) == '1') {
				blue.set(i, true);
			}
		}
		
		int count = 0;
		
		while (true) {
			List<Integer> index = new ArrayList<>();
			
			for (int i = 0; i < blue.size() - 1; i++) {
				if (blue.get(i) != blue.get(i + 1)) {
					index.add(i);
				}
			}
			
			if (index.size() <= 0) {
				break;
			} else {
				int tmp = index.get(index.size() / 2);
				
				for (int i = 0; i < 2; i++) {
					blue.remove(tmp);
				}
			}
			
			count += 2;
		}
		
		System.out.println(count);
	}
}
