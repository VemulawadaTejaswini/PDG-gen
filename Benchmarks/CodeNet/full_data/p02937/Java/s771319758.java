import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = s.length();
		int d = t.length();
		String b = "";
		for(int i = 0; i < d; i++){
			b = b + s;
		}
		boolean flg = false;
		int j = 0, i = 0;
		for(; i < b.length(); i++){
			if(b.charAt(i) == t.charAt(j)){
				j++;
				if(j == d){
					flg = true;
					break;
				}
			}
		}
		if(flg){
			System.out.println(i + 1);
		}
		else{
			System.out.println(-1);

		}

	}

}