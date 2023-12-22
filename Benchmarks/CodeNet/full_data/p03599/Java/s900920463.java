import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt(), F = sc.nextInt();
		ArrayList<Integer> water = new ArrayList<Integer>(); // あり得る水の量を全列挙
		ArrayList<Integer> sugar = new ArrayList<Integer>(); // あり得る砂糖の量を全列挙
		for(int i = 0; 100 * A * i <= F; i++) {
			for(int j = 0; 100 * A * i + 100 * B * j <= F; j++) {
				water.add(100 * A * i + 100 * B * j);
			}
		}
		for(int i = 0; C * i <= F; i++) {
			for(int j = 0; C * i + D * j <= F; j++) {
				sugar.add(C * i + D * j);
			}
		}
		int maxvol = 0, maxsug = 0;
		for(int w : water) {
			for(int s : sugar) {
				if(E * w >= 100 * s && s + w <= F && (maxvol == 0 || s * maxvol >= maxsug * (w + s))) {
					maxvol = w + s;
					maxsug = s;
				}
			}
		}
		System.out.println(maxvol+" "+maxsug);
	}
}