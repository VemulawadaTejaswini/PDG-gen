import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		long sum = 0;
		
		ArrayList<Long> h = new ArrayList<Long>();
		
		for(int i = 0; i < n; i++){
			h.add(scan.nextLong()); 
		}
		
		Collections.sort(h,Collections.reverseOrder());
		
		for(int i = k; i < n; i++){
			sum += h.get(i);
		}
		
		System.out.println(sum);
		
	}
}