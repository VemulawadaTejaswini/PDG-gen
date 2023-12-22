import java.util.ArrayList;
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
			int index = -1;
			
			for (int i = 0; i < blue.size() - 1; i++) {
				if (blue.get(i) != blue.get(i + 1)) {
					index = i;
					
					if(i > blue.size() / 2) {
						break;
					}
				}
			}
			
			if (index < 0) {
				break;
			} else {
				int tmp = index;
				
				for (int i = 0; i < 2; i++) {
					blue.remove(tmp);
				}
			}
			
			count += 2;
		}
		
		System.out.println(count);
	}
}
