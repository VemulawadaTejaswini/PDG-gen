import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		String[] strs = str.split("");
		List<String> list = new ArrayList<String>();
		String res = "";
		dfs(list, strs, 0, res);
		int cnt = 0;
		for(int i=0; i<list.size(); i++) {
			String tmp = list.get(i);
			for(int j=0; j<tmp.length(); j++) {
				char c = tmp.charAt(j);
				if(tmp.lastIndexOf(c)!=j) {
					cnt++;
				}
			}
		}
		System.out.println(list.size() - cnt -1);
	}

	private static void dfs(List<String> list, String[] strs, int start, String res) {
		if(start == strs.length) {
			list.add(res);
			return;
		}else {
			dfs(list, strs, start+1, res+strs[start]);
			dfs(list, strs, start+1, res);
		}
	}
}
