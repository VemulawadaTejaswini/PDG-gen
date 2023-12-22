import java.util.Scanner;

public class Main {

	private static String TENKI[] = {"Sunny","Cloudy","Rainy"};

	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		String ans = getAnswer(S) ;
		System.out.println(ans);
	}

	public String getAnswer(String S) {
		String ans = "" ;

		if(S.equals(TENKI[0])) {
			ans = TENKI[1] ;
		}else if(S.equals(TENKI[1])){
			ans = TENKI[2] ;
		}else if(S.equals(TENKI[2])){
			ans = TENKI[0] ;
		}
		return ans ;
	}


}
