import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double w,h,x,y;

		Scanner sc = new Scanner(System.in);

		w = sc.nextDouble();
		h = sc.nextDouble();

		x = sc.nextDouble();
		y = sc.nextDouble();

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
