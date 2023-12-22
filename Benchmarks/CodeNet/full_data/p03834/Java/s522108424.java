import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	sc.useDelimiter(",");

		// 文字列の入力
		String a = sc.next();
     	String b = sc.next();
      	String c = sc.next();
		// 出力
		System.out.println(a + " " + b + " " + c);
	}
}