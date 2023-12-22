import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String h = "h";
		String ii = "i";
		
		// まずstrArraySubに1文字多い配列を作る
		String[] strArray = new String[str.length()];
		 
		// 変数strの長さ分回す
		for (int i = 0; i < str.length(); i++) {
		    // strの先頭から1文字ずつString型にして取り出す
		    String str2 = String.valueOf(str.charAt(i));
		    // 配列に順番に格納する
		    strArray[i] = str2;
		}
		
		int h1 = str.indexOf(h);
//		System.out.println("h1は"+h1);
		if (h1 != -1) {
			int h2 = h1+1; 
		    if(ii.equals(strArray[h2])) {
		    	System.out.println("Yes");
		    }else {
		    	System.out.println("No");
		    }
		} else {
			System.out.println("No");
		}
		
	}
}