import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		for (int count = 0; count < N; count++) {
			int x = scan.nextInt();
			arr.add(x);
		}
		
		List<Integer> arr2 = new ArrayList<Integer>();
		int sum = 0;
		for (int count = 0; count < N; count++) {
			sum += arr.get(count);
			arr2.add(sum);
		}
		
		int counter = 0;
		for (int count = 0; count < arr2.size(); count++) {
			if(arr2.get(count) <= X) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
