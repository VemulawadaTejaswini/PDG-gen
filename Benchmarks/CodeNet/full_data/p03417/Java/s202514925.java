import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		long ans = 0;
		
		if(h == 1 && w == 1) {
			ans = 1;
			System.out.println(ans);
		}
		else if(h != 1 && w != 1) {
			ans =(long) (w - 2) * (h - 2);
			System.out.println(ans);
		}
		else {
			if(h == 1) {
				ans = w -2;
				System.out.println(ans);
			}
			if(w == 1) {
				ans = h -2;
				System.out.println(ans);
			}
		}
	}

}
