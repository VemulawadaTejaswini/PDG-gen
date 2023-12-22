import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		List<String> cur = new ArrayList<String>();
		for(int i = 0 ; i <= 9 ; ++i){
			cur.add(i + "");
		}
		if(K < cur.size()){
			System.out.println(cur.get(K));
			return ;
		}
		K -= (cur.size() - 1);
		for(int len = 2 ; len <= 10 ; ++len){
			List<String> next = new ArrayList<String>();
			for(int i = 1 ; i <= 9 ; ++i){
				for(String s : cur){
					int top = s.charAt(0) - '0';
					if(Math.abs(top - i) <= 1){
						next.add(i+s);
					}
				}
			}
			Collections.sort(next);
			if(K < next.size()){
				System.out.println(next.get(K - 1));
				return ;
			}
			K -= next.size();
			for(String s : cur){
				int top = s.charAt(0) - '0';
				if(top <= 1){
					next.add("0"+s);
				}
			}			
			cur = next;
		}
	}
}
