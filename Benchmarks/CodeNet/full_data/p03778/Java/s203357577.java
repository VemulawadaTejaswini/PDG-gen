

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int w, a, b, ans = 0;
		w = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a + w < b)
		ans = b - a - w;
		else if(a > b + w)
			ans = a - b - w;
		
		System.out.println(ans);
		
		sc.close();
	}

}
