import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		int l = a.length();
		char[] c = new char [l];
		for(int i = 0; i < l; i++){
			c[i] = a.charAt(i);
			//a:97 - z:122
		}
		int n = Integer.parseInt(br.readLine());
		while(n>0){
			boolean check = false;
			for(int i = 0; i < l; i++){
				if(c[i]!='a'){
					int v = 123-c[i];
					if(v<=n){
						check = true;
						n -= v;
						c[i] = 'a';
					}
				}
			}
			if(!check){
				n%=26;
				c[l-1] += n;
				n = 0;
			}
		}
		for(int i = 0; i < l; i++){
			sb.append(c[i]);
		}
		System.out.println(sb);
	}
}