import java.util.Scanner;
import java.util.Stack;

public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args){
		
		scanner = new Scanner(System.in);
		String s = scanner.next();
		
		String[] S = s.split("");
		Stack<String> T = new Stack<String>();
		
		for(int i=0; i<S.length; i++){
			if(S[i].equals("1")){
				T.push("1");
			}else if(S[i].equals("0")){
				T.push("0");
			}else if(S[i].equals("B")){
				if(T.empty() == false){
					T.pop();
				}
			}
		}
		
		while(T.empty() == false){
			System.out.print(T.pop());
		}
		System.out.println("");
	}
}