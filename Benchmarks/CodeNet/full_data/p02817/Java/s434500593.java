import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String one = sc.next();
		String two = sc.next();
		
		StringBuffer buf = new StringBuffer();
	
		buf.append(two);
		buf.append(one);
		String ans = buf.toString();
		
		System.out.println(ans);
	}

}
