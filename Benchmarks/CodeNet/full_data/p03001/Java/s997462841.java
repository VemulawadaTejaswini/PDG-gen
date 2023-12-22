import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int w,h,x,y;

		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		h = sc.nextInt();

		x = sc.nextInt();
		y = sc.nextInt();

		double result = w * h /2;

		int ans ;

		if(w/2 == x && h/2 == y) {
			ans = 1;
			}else {
			ans = 0;
		}

		System.out.println(result + " " + ans);

	}

}
