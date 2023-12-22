import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int res = 0;
		for(int i=1;i<=3;i++) {
			if(i != n1 && i!= n2) {
				res = i;
				break;
			}
		}
		// 出力
		System.out.println(res);

		//scclose
		sc.close();
	}

}
