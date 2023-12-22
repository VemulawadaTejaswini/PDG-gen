import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int min = get2times(sc.nextInt());
		
		for(int i=1; i<n; i++) {
			int k = sc.nextInt();
			if(get2times(k)<min) {
				min = get2times(k);
			}
		}
		
		System.out.println(min);
	}
	
	public static int get2times(int n) {
		int count = 0;
		while(n%2 == 0) {
			n = n/2;
			count ++;
		}
		
		return count;
	}
}
