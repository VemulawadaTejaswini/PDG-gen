import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
/*
問題文
とある世界では、今日は 12月 D日です。
D=25なら Christmas, D=24なら Christmas Eve, D=23なら Christmas Eve Eve, D=22なら Christmas Eve Eve Eve と出力
制約
22<=D<=25
Dは整数
*/
		System.out.print("Christmas");
		int D = sc.nextInt();
		for (int i = 0; i < 25 - D; i++){
			System.out.print(" Eve");
		}
	}
}
