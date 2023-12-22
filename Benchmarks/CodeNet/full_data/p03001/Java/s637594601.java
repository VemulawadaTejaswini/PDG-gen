import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
		if (x == w/2 && y == h/2) {
        	ans = 1;
        }
        double s = w * h / 2;
		System.out.println(s, ans);
	}
}