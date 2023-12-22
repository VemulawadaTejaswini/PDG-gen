import java.util.*;
public class Main{
	static boolean PostNumCheck(String s, int p, int q){
		if(s.charAt(p)!='-')return false;
		for(int i=0; i<p; i++){
			if(s.charAt(i)=='-')return false;
		}
		for(int i=p+1; i<p+q+1; i++){
			if(s.charAt(i)=='-')return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String S = sc.next();
		System.out.println(PostNumCheck(S, a, b)==true ? "Yes" : "No");
	}
}