import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int ans = 0;

		if(c <= a) {
			if(a <= d) ans = d - a;
			else if(b <= d) ans = b - a;
			else ans = 0;
		}
		if(a < c) {
			if(d <= b) {
				ans = d - c;
			}
          	else if(b <= c){
              ans = 0;
            }
			else {
				ans = b - c;
			}
		}
		System.out.println(ans);
	}
}