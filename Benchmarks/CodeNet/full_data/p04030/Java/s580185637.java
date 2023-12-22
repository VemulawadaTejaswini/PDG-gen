import java.util.Scanner;
import java.util.Stack;

/**
 * https://abc043.contest.atcoder.jp/tasks/abc043_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		Stack<Character> stack = new Stack<>();
		
		for(char c:s.toCharArray()){
			if(c=='B'){
				if(!stack.isEmpty()) stack.pop();
			}else{
				stack.push(c);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(char c:stack){
			ans.append(c);
		}
		
		System.out.println(ans);
		
	}

}
