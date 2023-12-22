import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
		
			int n = sc.nextInt();
			
			Set<Integer> countSet = new HashSet<>();
			boolean isDuplicated = false;
			
			for(int i = 0 ; i < n ; i++ ) {
				
				int v = sc.nextInt();
				
				if (countSet.contains(v)) {
					isDuplicated = true;
				}
				countSet.add(v);
			}
			
			if ( isDuplicated ) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
}