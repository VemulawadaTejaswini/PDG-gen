import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		S = S.replaceAll("×", "");
		if(S.length() > 8) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();