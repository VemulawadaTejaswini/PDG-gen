import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		String str = sc.next();
      	str = str.replace("0","");
		// 出力
		System.out.println(str.length());
	}
}