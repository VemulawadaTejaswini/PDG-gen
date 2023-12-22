import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] a = s.toCharArray();
		char[] b = new char[26];
		if(s.length() == 26){
			for(int i=25; i>0; i--){
				if(a[i-1] < a[i]){
					for(int j=25; j>0; j++) {
						if(a[j] > a[i-1]) {
							a[i-1] = a[j];
							String res = "";
							for(i=0; i<i-1; i++) {
								res += a[i];
								System.out.println(res);
								return;
							}
						}
					}
				}
			}
		} else{
			for(int i=0; i<s.length(); i++){
				b[a[i]-'a'] = a[i];
			}
			for(int i=0; i<26; i++){
				if(b[i] == 0){
					b[i] = (char) ('a' + i);
					System.out.println(s+b[i]);
					return;
				}
			}
		}
	}
}
