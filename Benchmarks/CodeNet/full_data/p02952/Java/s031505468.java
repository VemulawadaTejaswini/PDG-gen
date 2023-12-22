import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i < a; i++){
			if(i < 10 || (100 <= i && i < 1000) || (10000 <= i && i < 100000)){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}