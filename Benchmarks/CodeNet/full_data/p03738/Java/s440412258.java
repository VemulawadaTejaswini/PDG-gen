import java.util.*;
public class Main{
	static String Comp(String s, String t){
		if(s.length()>t.length())return"GREATER";
		else if(s.length()<t.length())return"LESS";
		else{
			for(int i=0; i<s.length(); i++){
				if(Character.getNumericValue(s.charAt(i))>Character.getNumericValue(t.charAt(i)))return "GREATER";
				else if(Character.getNumericValue(s.charAt(i))<Character.getNumericValue(t.charAt(i)))return "LESS";
			}
		return "EQUAL";
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(Comp(a, b));
	}
}