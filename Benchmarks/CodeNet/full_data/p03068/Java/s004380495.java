import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
//指定された番号の文字列 r
String x = b.substring(c, c++);
String out = null;
for (int i = 0; i < a; i++) {
	String y = b.substring(i, i++);
	if(!(y.equals(x)) ) {
		out = out+"*";
	}else {
		out = out + y;
	}
}
System.out.println(out);
}
}