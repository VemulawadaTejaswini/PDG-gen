
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		char []c = sc.next().toCharArray();
		ArrayList <Integer> List = new ArrayList <Integer>();
		
		int cnt = 0;
		char now = '1';
		
		for(int i = 0 ; i < n ;i++) {
			if(now == c[i]) {
				cnt++;
			}
			else {
				List.add(cnt);
				now = (char)((now - '0' + 1) % 2 + '0');
				cnt = 1;
			}
		}
		
		List.add(cnt);
		
		if(List.size() % 2 == 0) {
			List.add(0);
		}
		int m = List.size();
	
		int [] sum = new int [m+1];
		
		for(int i = 0 ; i < m ; i++) {
			sum[i+1] = sum[i] + List.get(i);
		}
		
		
		int max = 0;
		int K = 2 * k + 1;
		
		for(int i = 0 ; i <= m ; i+=2) {
			int j = Math.min(i + K , m);
			//System.out.println(i+" "+j+" "+(sum[j] - sum[i]));
			max = Math.max(max, sum[j] - sum[i]);
		}
		
		System.out.println(max);
	}		
}


