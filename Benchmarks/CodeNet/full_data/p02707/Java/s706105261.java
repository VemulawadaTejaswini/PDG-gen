import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n-1];
		
		/*for(int i = 0; i < a.length; i++) {
			a[i] = stdIn.nextInt();
		}*/
		int[] b = new int[n];
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < n-1; i++) {
			int s = stdIn.nextInt();
			b[s-1]++;
		}
		
		for(int aa: b) {
			System.out.println(aa);
		}
		
		
	}

}
