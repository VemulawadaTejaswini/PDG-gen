import java.util.*;
public class Main{
	static int maxOfVar(int k, String s){
		String[] alph = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		int num = 0;
		int cnt = 0;
		for(int i=0; i<k; i++){
			cnt = 0;
			String x = s.substring(0,i);
			String y = s.substring(i);
			for(int j=0; j<26; j++){
				if(!x.equals(x.replaceAll(alph[j],"")) && !y.equals(y.replaceAll(alph[j],"")))cnt++;
			}
			if(num<cnt)num = cnt;
		}
		return num;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		System.out.println(maxOfVar(n,S));
	}
}