import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h;
		int ans = 0;
		
		
		for(int i = 0; i < n; i++) {
			h = sc.nextInt();
			if(h >= k) ans++;
		}
		
		System.out.println(ans);

	}
}
