import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();
		
		int x = n/2;
		int y = n-x;
		
		String xStr = s.substring(0, x);
		String yStr = s.substring(x, n);

		int cnt = 0;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < x; i++) {
			String z = xStr.substring(i, i+1);
			if ( list.contains(z) ){
				continue;
			}
			if ( yStr.contains(z) ){
				cnt++;
				list.add(z);
			}
		}

		System.out.println(cnt);

		sc.close();

	}
}