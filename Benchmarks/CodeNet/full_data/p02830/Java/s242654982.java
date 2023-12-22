
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < s.length();i++){
			sb.append(s.charAt(i));
			sb.append(t.charAt(i));

		}
		System.out.println(new String(sb));





	}
}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
