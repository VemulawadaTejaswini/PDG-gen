import java.util.*;

public class Main {

	public static boolean judge(char o[], char t){
		for(int i = 0; i < 3; ++i){
			if(o[i] == t)return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans[] = {"Yes", "No"};
		char odd[] = {'R', 'U', 'D'};
		char equal[] = {'L', 'U', 'D'};
		sc.close();
		int an = 0;
		int n = s.length();
		for(int i = 0; i < n; ++i){
			char t = s.charAt(i);
			if(i % 2 == 0){
				if(!judge(odd, t))an = 1;
			}
			else{
				if(!judge(equal, t)) an = 1;
			}
		}

		System.out.println(ans[an]);
	}
}
