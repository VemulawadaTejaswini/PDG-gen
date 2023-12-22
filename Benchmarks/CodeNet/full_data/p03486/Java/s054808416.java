import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		Arrays.sort(s);
		Arrays.sort(t);
		
		System.out.println(isSmall(s, t) ? "Yes" : "No");
	}
	static boolean isSmall(char[] s, char[] t){
		for(int i=0;i<Math.min(s.length, t.length);i++){
			if(s[i]<t[t.length-1-i])
				return true;
			if(s[i]>t[t.length-1-i])
				return false;
		}
		
		return s.length<t.length;
	}
}
