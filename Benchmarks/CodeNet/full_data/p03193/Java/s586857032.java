import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, a, b, h, w, count = 0;
		n = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a >= h && b >= w)++count;
		}
		
		sc.close();
		
		System.out.println(count);
	}

}
