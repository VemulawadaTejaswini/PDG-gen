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
		int n = 0,w = 0,s = 0, e= 0;
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='N')
				n++;
			if(c=='S')
				s++;
			if(c=='E')
				e++;
			if(c=='W')
				w++;
		}
		if(n==s && w==e){
			sb.append("Yes");
		}else{
			sb.append("No");
		}
		System.out.println(sb);
	}
}