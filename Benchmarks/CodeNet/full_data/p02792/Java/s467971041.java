
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		int[] startFrom = new int[11];
//		int[] endTo = new int[11];
		int startEnd[][] = new int[11][11];
		int startEqualEnd = 0;
		
		for(int i = 1; i <= n; i++) {
			String str = Integer.toString(i);
			
			int left = str.charAt(0) - '0';
			int right = str.charAt(str.length() - 1) - '0';
			
//			startFrom[left]++;
//			endTo[right]++;
			startEnd[left][right]++;
			if(left == right) {
				startEqualEnd++;
			}
		}
		
		long total = 0;
//		for(int i = 1; i <= 9; i++) {
//			//debug
//			System.out.println("i = "+i+" startFrom "+startFrom[i]+" endTo " +endTo[i]);
//			total += startFrom[i] * endTo[i];
//		}
//		System.out.println("startEqualEnd "+startEqualEnd);
		
		for(int i = 1; i <= n; i++) {
			String str = Integer.toString(i);
			
			int left = str.charAt(0) - '0';
			int right = str.charAt(str.length() - 1) - '0';
			
			total += startEnd[right][left];
			
//			System.out.println("i = "+i+" add "+startEnd[right][left]);
		}
//		total -= startEqualEnd;
	
		System.out.println(total);
	}

}
