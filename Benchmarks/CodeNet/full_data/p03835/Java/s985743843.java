import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();

		int x = 0;
		int y = 0;
		int z = 0;

		int countS = 0;
		int countK = 0;
		countS = (s + 2) * (s + 1) / 2; //0以上で合計がｓになる３つの数
		//あとは→ｋ以上を使っているのを排除
		for(x=k;x<=s;x++) {
			for(y=k;y<=s;y++) {
				for(z=k;z<=s;z++) {
					if(x+y+z==s) {
						countK++;
					}
				}
			}
		}

		int show = countS-countK;
		if(s==3*k) {
			show=1;
		}




		System.out.println(show);
	}
}
