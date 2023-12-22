import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cnt = Math.abs(Math.abs(x) - Math.abs(y));
		if (x < 0) {
			if (y < 0) {
				if (x > y) {
					cnt += 2;
				} else {
					cnt++;
				}
			} else {
				cnt++;
			}
		} else {
			if (y < 0) {
				cnt++;
			}
		}
		// 出力
		System.out.println(cnt);
	}
}
