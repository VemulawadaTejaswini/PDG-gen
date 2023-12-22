import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		Arrays.sort(s);
		Arrays.sort(t);
		t = reverce(t);
		for(int i = 0; i < s.length && i < t.length; i++){
			if(equal(t,s)){
				System.out.println("No");
				break;
			}
			if(s == t){
				System.out.println("No");
				break;
			}
			if((int)s[i] < (int)t[i]){
				System.out.println("Yes");
				break;
			}else if((int)s[i] > (int)t[i]){
				System.out.println("No");
				break;
			}else if(i + 1 == s.length || i + 1 == t.length){
				System.out.println("Yes");
			}
		}
	}

	public static char[] reverce(char[] c){
		char[] t = new char[c.length];
		for(int i = (c.length - 1);0 <= i; i--){
			t[c.length - i - 1] = c[i];
		}
/*		for(char a: t){
			System.out.print(a);
		}
		System.out.println();*/
		return t;
	}

	public static boolean equal(char[] t, char[] s){
		if(t.length == s.length){
			for(int i = 0;i < t.length; i++){
				if(t[i] != s[i]){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
}
