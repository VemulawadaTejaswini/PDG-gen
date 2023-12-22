import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int N = scan.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int count = 0; count < N; count++) {
			int x = scan.nextInt();
			H = H - x;
			arr.add(x);
			if(H <= 0) {
				break;
			}
		}
		
		for (int i = 0; i < arr.size(); i++) {
		     for (int j = i + 1 ; j < arr.size(); j++) {
		          if (arr.get(i).equals(arr.get(j))) {
		        	  System.out.println("Yes");
		          }
		     }
		}
		System.out.println("No");
		
	}
}
