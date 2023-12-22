import java.util.*;
public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int len = s1.length();
		int x[][] = new int[len+1][26];
		int y[] = new int[26];

		for(int i = 1; i <= len; i++){
			int c = s1.charAt(i - 1) - 'a';
			for(int j = 0; j < 26; j++){
				if(x[y[j]][c] == 0)x[y[j]][c] = i;				 
				//if(i == 7 )System.out.println(y[j] + " " + c + " "+i);
			}
			
			//if(i == 4 )System.out.println(i);
			//System.out.println("!"+y[19]+" "+x[3][19]);
			y[c] = i;
		}
		//System.out.println(x[3]['t'-'a'] + " "+('t'-'a'));
		int leng = s2.length();
		int t = 0;
		boolean can = true;
		int ans = 0;
		for(int i = 0; i < leng; i++){
			int c = s2.charAt(i) - 'a';
			if(x[t][c] == 0 && x[0][c] == 0){
				can = false;
				break;
			}
			else if(x[t][c] == 0){
				if(x[t][s1.charAt(t-1)-'a'] == 0){
					ans += (len - t + x[0][c]);
					t = x[0][c];
				}
				else{
					boolean ye = false;
					int k = x[t][s1.charAt(t-1)-'a'];
					while(x[t][s1.charAt(t-1)-'a'] != 0){
						if(x[k][c] == 0){
							if(x[t][s1.charAt(t-1)-'a'] == 0)break;
							else{
								k = x[t][s1.charAt(t-1)-'a'];
							}
						}
						else{
							ye = true;
							break;
						}
					}
					if(ye){
						ans += (x[k][c] - t);
						t = x[k][c];
					}
					else{
						ans += (len - t + x[0][c]);
						t = x[0][c];
					}
				}
			}
			else{
				ans += (x[t][c] - t);
				t = x[t][c];
			}
			//System.out.println(t+" " +ans);
		}
		if(can)System.out.println(ans);
		else System.out.println(-1);
	}
	
}