import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 0;
		int Cost = 0;
		int mid = 0;
		int count = 0;
		int mid2 = 0;
		ArrayList <Integer> Array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		for(int i = 0;i < N; i++) {
			Array.add(scan.nextInt());
		}

		Collections.sort(Array, Comparator.naturalOrder());
		if(Array.size() % 2 != 0) {
			mid = Array.get(Array.size() / 2);
		}
		else {
			mid = (Array.get(Array.size() / 2) + Array.get((Array.size() / 2) - 1)) / 2;
		}
		mid2 = mid;
		for(int k : Array) {
			if(k == mid2) {
				count += 1;
				if(count > 1) {
					mid += 1;
					if(count == Array.size()) {
						mid = mid2; 
					}
				}
			}
		}
		for(int j = 0; j < Array.size(); j++){
			Cost += (Array.get(j) -mid) * (Array.get(j) - mid);
		}
		System.out.println(Cost);

	}
}