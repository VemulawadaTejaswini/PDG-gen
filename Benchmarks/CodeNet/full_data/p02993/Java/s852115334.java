import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	    Scanner sc = new Scanner(System.in);  //標準入力の宣言

		String S = sc.next();  //標準入力をSに代入
		
		char[] s = S.toCharArray();  //Sを1文字ずつ配列に入れる
		
		if(s[0]==s[1] || s[1]==s[2] || s[2]==s[3]){
			System.out.println("Bad");
		} else {
			System.out.println("Good");}

  }
}
