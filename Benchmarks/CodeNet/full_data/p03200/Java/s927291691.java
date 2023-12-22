import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] input = str.split("");
		int stack=0;
		int answer = 0;
		for (int i=0;i<input.length; i++){
			if (input[i].equals("W")){
				answer += i-stack;
				stack++;
			}
			
		}
		System.out.println(answer);
	}
}