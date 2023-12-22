import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] cnt = new int[26];
		
		for(int i=0;i<s.length();i++) {
			cnt[s.charAt(i)-'a']++;
		}
		
		System.out.println(found(cnt));
	}
	static String found(int[] cnt) {
		for(int i=0;i<26;i++) {
			if(cnt[i]==0)
				return (char)(i+'a')+"";
		}
		return "None";
	}
}
