import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		Set<Long> set = new HashSet<Long>();
		int n = scan.nextInt();
		
		for(int i = 0; i < n ; i++){
			set.add(scan.nextLong());
		}
		System.out.println( set.size() == n ? "Yes":"No");
		
	}
}