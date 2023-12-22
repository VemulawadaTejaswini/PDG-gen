import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int k = sc.nextInt();
			String[] splited = s.split("");
			int num = 1;
			long ans = 0;
			String pre = null;
			for(String hoge : splited) {
				if(pre == null) {
					pre = hoge;
				} else if(pre.equals(hoge)) {
					num++;
				} else {
					ans += (int)Math.floor(num / 2d);
					num = 1;
					pre = hoge;
				}
			}
			ans += (int)Math.floor(num / 2d);
			System.out.println(ans * k);
		}

	}

}
