import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = new char[N + 1];
		int ans = 0;
		List<char[]> list = new ArrayList<char[]>();
		
		for(int i = 1; i <= N; i++) {
			String str = sc.next();			
			char[] c = str.toCharArray();
			Arrays.sort(c);
			list.add(c);
		}
		
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(Arrays.equals(list.get(i), list.get(j) ) ) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	

	}	
}