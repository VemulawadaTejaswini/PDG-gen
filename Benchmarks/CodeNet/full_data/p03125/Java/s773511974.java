
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();
		int ans;
		if (b%a==0){
			ans = a+b;
		}
		else{
			ans = b-a;
		}
		System.out.println(ans);
		
	}

}
