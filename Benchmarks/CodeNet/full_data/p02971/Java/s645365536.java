
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> originalList = new ArrayList();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			originalList.add(number);
		}
		ArrayList<Integer> sortedList = (ArrayList<Integer>) originalList.clone();
		Collections.sort(sortedList);
		int maxNumber = sortedList.get(n - 1);
		int secondNumber = sortedList.get(n - 2);
		
		for(int i = 0; i < n; i++) {
			int t = originalList.get(i);
			if(originalList.get(i).equals(maxNumber)) {
				System.out.println(secondNumber);
			}else {
				System.out.println(maxNumber);
			}

		}
		

		
		

		
		
	}	

}

