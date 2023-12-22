import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int n,m;
	static int[] v,t;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int l = s.length();
		char c1 = '1';
		char c2 = '2';
		for(int i = 0; i < l; i++){
			char c = s.charAt(i);
			if(c==c1){
				sb.append(i-1).append(' ').append(i);
				System.out.println(sb);
				return;
			}else if(c==c2){
				sb.append(i-2).append(' ').append(i);
				System.out.println(sb);
				return;
			}
			c2 = c1;
			c1 = c;
		}
		sb.append("-1 -1");
		System.out.println(sb);
	}
}