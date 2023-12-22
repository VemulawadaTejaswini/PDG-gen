import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        double w2 = w /2.0;
        double h2 = h /2.0;
		if ((x == w2) && (y == h2)) {
        	ans = 1;
        }
        double s = w * h / 2;
		System.out.print(s);
        System.out.print(ans);
	}
}