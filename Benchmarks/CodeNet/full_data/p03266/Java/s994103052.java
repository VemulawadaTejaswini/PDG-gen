import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int val = sc.nextInt();
		int ans = 0;
		if(val % 2 == 0) {
			ans = (int) Math.pow(Math.floor((double) max / val), 3);
			ans += (int) Math.pow(Math.floor((double) (max + val * 0.5) / val), 3);
		}else {
			ans = (int) Math.pow(Math.floor((double) max / val), 3);
		}
		System.out.println(ans);
	}
}