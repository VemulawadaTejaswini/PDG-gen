
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] a = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		boolean status = true;
		for(int i = 0; i < n - 1; ++i) {
			if(a[i] == a[i + 1]) {
				status = false;
				break;
			}
		}
		String answer = "YES";
		if(!status) {
			answer = "NO";
		}
		System.out.println(answer);
		input.close();	
	}
}
