
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());
		int a = 0;
		char [][]num = new char [h][w];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				num[i][j] = s.charAt(j);
				if(num[i][j] == '1') {
					a++;
				}
			}
		}
		if(a <= k) {
			System.out.println(0);
			return;
		}
		
		int ans = (int)Math.ceil((double)a/k);
		
		System.out.println(ans);
		
		
	}

}
