import java.util.Scanner;
public class Main {
//途中放棄
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n１以上");
		int n = scan.nextInt();
		System.out.println("k２以上");
		int k = scan.nextInt();
		
		int[] ball = new int[n+1];
		int[] color = new int[k+1];
		for(int i = 0 ; i <= n; i++) {
			ball[i] = i;
		}
		for(int i = 0 ; i <= k; i++) {
			color[i] = i;
		}
		
		int m, s;
		if(n < k) {
			m = k;
			s = n;
		}else {
			m = n;
			s = k;
		}
		int f;
		if(m == s) {
			f = m;
		}else {
			f = 0;
		}
		int sum = 0;
		int count = 0;
		for(int i = 0; i < ball.length-1; i++) {
			for(int j = 0; j < color.length-1; j++) {
				count++;
				sum *= color[j];
			}
		}
		System.out.println(count - f);
		System.out.println(sum);
	}

}
