

import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	final int L = 0;
	final int R = 1;
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ss = in.next();
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < n; i++){
			if(ss.charAt(i) == '(') s.push(L);
			if(ss.charAt(i) == ')'){
				if(!s.isEmpty()){
					int a = s.pop();
					if(a != L){
						s.push(R);
						s.push(R);
					}
				}else{
					s.push(R);
				}
			}
		}

		while(!s.isEmpty()){
			if(s.pop() == L) ss += ")";
			else ss = "(" + ss;
		}
		System.out.println(ss);
		in.close();
	}
}
