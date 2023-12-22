import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int count = 0;
		boolean flag = false;
		for(int i = 0;i < n;i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n;i++) {
			for(int j = 0;j < i + 1;j++) {
				if(p[i] > p[j]) {
					flag = false;
					break;
				}else {
					flag = true;
				}
			}
			if(flag) {
				count++;
			}
		}

		System.out.println(count);
	}

}