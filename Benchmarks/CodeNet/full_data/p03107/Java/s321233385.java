
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();

		Stack<Integer> stack = new Stack<Integer>();

		int count = 0;
		for(int i = 0; i < str.length; i++){
			if(str[i] == '0'){
				stack.push(0);
			}
			else {
				if(!stack.isEmpty()){
					stack.pop();
					count++;
				}
			}
		}

		stack.removeAllElements();
		int count2 = 0;
		for(int i = 0; i < str.length; i++){
			if(str[i] == '1'){
				stack.push(0);
			}
			else {
				if(!stack.isEmpty()){
					stack.pop();
					count2++;
				}
			}
		}

		System.out.println(Math.max(count*2, count2*2));
	}
}