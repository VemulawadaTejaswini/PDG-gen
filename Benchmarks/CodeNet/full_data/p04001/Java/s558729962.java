import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			long ans = dfs(0,0,0,s);
			System.out.println(ans);
		}
		
		static long dfs(int id,int preid, long sum, String s) {
			if(id == s.length()) {
				if(id != preid)
				sum += Long.parseLong(s.substring(preid, id));
				return sum;
			}
			long ret = dfs(id+1, preid, sum, s);
			if(id != preid) {
				ret += dfs(id+1,id,sum + Long.parseLong(s.substring(preid,id)),s);
			}
			
			return ret;
		}

		

}
