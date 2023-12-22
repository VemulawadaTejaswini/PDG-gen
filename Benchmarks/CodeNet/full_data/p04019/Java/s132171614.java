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
		if(l%2!=0){
			System.out.println("No");
			return;
		}
		int x=0,y=0;
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='N')
				y--;
			if(c=='S')
				y++;
			if(c=='E')
				x++;
			if(c=='W')
				x--;
		}
		if(x==0 && y==0){
			sb.append("Yes");
		}else{
			sb.append("No");
		}
		System.out.println(sb);
	}
}