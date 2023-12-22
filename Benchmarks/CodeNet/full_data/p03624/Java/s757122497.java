import java.util.*;
public class Main{
	static String NotFound(String s){
		char[] alph = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int num;
		for(int i=0; i<26; i++){
			num = 0; 
			for(int j=0; j<s.length(); j++){
				if(alph[i]==s.charAt(j))num++;
			}
			if(num==0)return String.valueOf(alph[i]);
		}
		return "None";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(NotFound(S));
	}
}