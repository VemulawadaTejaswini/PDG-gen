
import java.util.Scanner;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		dfs(n);
		
		

	}
	
	static void dfs(int n) {
		
		if(sb.length() == n) {
			System.out.println(sb.toString());
			return;
		}
		
		for(char i = 'a' ; i <= 'a' + sb.length();i++) {
			sb.append(i);
			dfs(n);
			sb.deleteCharAt(sb.length()-1);
		}
		
	}

}
