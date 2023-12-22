import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		StringBuilder sb = new StringBuilder();
		StringBuilder p = new StringBuilder();
		StringBuilder q = new StringBuilder();

		for(int i = 0; i < n; i++) {
			p.append(scan.next());
			sb.append(i + 1);
		}
		for(int i = 0; i < n; i++) {
			q.append(scan.next());
		}
		sub(sb.toString());

		String strP = p.toString();
		String strQ = q.toString();

		int cntP = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(strP)) {
				cntP = i + 1;
				break;
			}
		}

		int cntQ = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(strQ)) {
				cntQ = i + 1;
				break;
			}
		}

		System.out.println(Math.abs(cntQ - cntP));
	}
	public static void sub(String target, String ans) {
		if(target.length() <= 1) {
			list.add(ans + target);
		} else {
			for(int i = 0; i < target.length(); i++) {
				sub(target.substring(0,i) + target.substring(1 + i)
				,ans + target.substring(i,i + 1));
			}
		}
	}
	public static void sub(String target) {
		sub(target,"");
	}
}
