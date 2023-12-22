import java.util.Scanner;

/**
 * https://abc055.contest.atcoder.jp/tasks/arc069_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		
		boolean[] ans = check(true, true, s);
		if(ans==null) ans = check(true, false, s);
		if(ans==null) ans = check(false, true, s);
		if(ans==null) ans = check(false, false, s);
		StringBuilder sb = new StringBuilder();
		if(ans!=null){
			for(boolean a:ans) sb.append( a ? 'S' : 'W');
		}else{
			sb.append("-1");
		}
		System.out.println(sb.toString());
	}
	
	static boolean[] check(boolean s1, boolean s2, char[] s){
		boolean[] ans = new boolean[s.length];
		ans[0] = s1; ans[1] = s2;
		for(int i=2; i<s.length; i++){
			if(s[i-1]=='o'){
				ans[i] = ans[i-1] ? ans[i-2] : !ans[i-2]; 
			}else{
				ans[i] = ans[i-1] ? !ans[i-2] : ans[i-2]; 
			}
		}
		
		if(s[s.length-1] == 'o'){
			if(ans[s.length-1] && ans[s.length-2] == ans[0]) return ans;
			if(!ans[s.length-1] && ans[s.length-2] != ans[0]) return ans;
			return null;
		}else{
			if(ans[s.length-1] && ans[s.length-2] != ans[0]) return ans;
			if(!ans[s.length-1] && ans[s.length-2] == ans[0]) return ans;
			return null;
		}
		
	}

}