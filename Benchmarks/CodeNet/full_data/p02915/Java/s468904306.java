import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int pasNum = sc.nextInt();
	int ans = (int) Math.pow(pasNum,3);
	System.out.println(ans);

    // Scannerクラスのインスタンスをクローズ
	sc.close();
	}
}
