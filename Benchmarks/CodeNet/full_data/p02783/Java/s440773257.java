import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 体力の入力
		int tairyoku = sc.nextInt();
		// 攻撃の入力
		int kougeki = sc.nextInt();
		
		int kaisu = tairyoku/kougeki;
		int tmp = tairyoku%kougeki;
		if(tmp != 0) {
			kaisu = kaisu +1;
		}
		
		System.out.println(kaisu);
		
	}
}