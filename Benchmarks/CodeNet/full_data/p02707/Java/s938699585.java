import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			
			int[] mCount = new int[n];
			
			for(int i = 1 ; i < n ; i++ ) {
				
				int id = sc.nextInt();
				
				mCount[id-1]++;
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				System.out.println(mCount[i]);
			}
			
			
		}
	}

}