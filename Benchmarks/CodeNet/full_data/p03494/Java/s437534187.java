import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt()
		String str[] = sc.nextLine().split(" ");
		int count = 0;			// 操作を行った数
		boolean flag = true;	// 奇数があったらfalse

		while (flag) {
			for (int i = 0; i < str.length; i++) {
				flag |= Integer.parseInt(str[i]) % 2 != 0;
			}
			if (!flag) {
				break;
			}
			count++;
			for (int i = 0; i < str.length; i++) {
				str[i] = String.valueOf(Integer.parseInt(str[i]) / 2);
			}
		}

		System.out.println(count);
	}
}