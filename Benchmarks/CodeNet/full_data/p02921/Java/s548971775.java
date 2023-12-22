import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 天気予報の取得
		String yohou = sc.next();
		//天気の結果取得
		String result = sc.next();
		sc.close();
		int count = 0;
		int j = 0;
		//カウントする。
		for(int i = 0; i < 3; i++) {
			j= i;
			if(yohou.substring(i, i+1) == result.substring(j, j+1)) {
				count++;
			}
		}
		// 出力
		System.out.println(count);
	}

}