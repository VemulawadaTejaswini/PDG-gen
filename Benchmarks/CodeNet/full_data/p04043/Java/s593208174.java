import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int five = 0;
		int seven = 0;
		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			if(num == 5) {
				five++;
			}else if(num == 7) {
				seven++;
			}
		}
		if(five == 2 && seven == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}