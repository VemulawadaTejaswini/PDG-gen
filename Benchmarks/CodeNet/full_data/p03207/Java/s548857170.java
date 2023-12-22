import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int total = 0;
		sc.nextInt();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a > max) max = a;
			total += a;
		}
		// 出力
		System.out.println(total - max/2);
	}
}
