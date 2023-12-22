import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans=new int[26];
		Arrays.fill(ans,Integer.MAX_VALUE);
		for(int i = 0; i < n; i++){
			String a = sc.next();
			for(int j = 0; j < a.length(); j++){
				ans[a.charAt(j)-'a']++;
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i = 0; i < 26; i++){
			for(int j = 0; j < ans[i]; j++){
				sb.append((char)(i+'a'));
			}
		}
		System.out.println(sb);
	}
}