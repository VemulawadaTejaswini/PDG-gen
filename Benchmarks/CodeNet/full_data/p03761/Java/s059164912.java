import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans=new int[26];
		Arrays.fill(ans, 51);
		for(int i = 0; i < n; i++){
			String a = sc.next();
			int[] tmp =new int[26];
			for(int j = 0; j < a.length(); j++){
				tmp[a.charAt(j)-'a']++;
			}
			for(int k=0; k<26; k++){
				ans[k]=Math.min(ans[k],tmp[k]);
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