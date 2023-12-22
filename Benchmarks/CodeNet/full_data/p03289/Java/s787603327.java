import java.util.*;
public class Main{
	static String ACJudge(String s){
		if(s.charAt(0)!='A')return "WA";
		int count = 0;
		int idx = 0;
		for(int i=2; i<s.length()-1; i++){
			if(s.charAt(i)=='C'){
				count++;
				idx = i;
			}
		}
		if(count!=1)return "WA";
		String t = s.toLowerCase();
		if(!s.substring(1, idx).equals(t.substring(1, idx)))return "WA";
		if(!s.substring(idx+1).equals(t.substring(idx+1)))return "WA";
		return "AC";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println(ACJudge(st));
	}
}