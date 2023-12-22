import java.util.*;
public class Main{
	static String Vari(String s){
		char[] c = new char[s.length()];
		for(int i=1; i<s.length(); i++){
			c[i] = s.charAt(i);
		}
		for(int i=0; i<s.length()-1; i++){
			for(int j=i+1; j<s.length(); j++){
				if(c[i]==c[j])return "no";
			}
		}
		return "yes";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(Vari(S));
	}
}