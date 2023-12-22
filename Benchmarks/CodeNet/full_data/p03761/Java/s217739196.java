import java.util.*;
public class Main{
	static String DubDoc(int p, String[] s){
		char[] alph = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[][] count = new int[26][p];
		String t = "";
		for(int i=0; i<26; i++){
			for(int j=0; j<p; j++){
				for(int k=0; k<s[j].length(); k++){
					if(s[j].charAt(k)==alph[i])count[i][j]++;
				}
			}
			Arrays.sort(count[i]);
			for(int l=0; l<count[i][0]; l++){
				t += alph[i];
			}
		}
		return t;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] S = new String[n];
		for(int i=0; i<n; i++){
			S[i] = sc.next();
		}
		System.out.println(DubDoc(n, S));
	}
}