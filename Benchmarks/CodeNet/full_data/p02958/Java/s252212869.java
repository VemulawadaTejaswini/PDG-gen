import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> initialList = new ArrayList();
		for(int i = 0; i < n; i++) {
			initialList.add(sc.nextInt());
		}
		
		List<Integer> sortedList = initialList.stream().sorted().collect(Collectors.toList());
		
		int count = 0;
		String message = "YES";
		for(int i = 0; i < n; i++) {
			if(initialList.get(i) != sortedList.get(i)) {
				count++;
				if(count > 2) {
					message = "NO";
					break;
				}
			}
		}
		System.out.println(message);
		

		
		

		
		
	}	

}

