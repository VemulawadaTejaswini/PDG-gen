import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int a = s.charAt(0);
		int cnt = 1;
		for(int i = 1; i < n; i++){
			if(s.charAt(i) != a){
				cnt++;
				a = s.charAt(i);
			}
		}
		System.out.print(cnt);
	}

}