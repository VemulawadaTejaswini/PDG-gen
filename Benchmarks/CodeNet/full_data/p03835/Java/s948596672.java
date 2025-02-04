import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		int k = Integer.parseInt(str[0]);
		int s = Integer.parseInt(str[1]);
		int cnt = 0;

		int x = 0;
		int y = 0;
		int z = 0;
		for(x = k; x > -1; --x){
			int rest = s - x;
			if(rest > 2*k)
				continue;
			if(rest > k){
				cnt += -(rest - 2*k) + 1;
			}else{
				cnt += rest + 1;
			}
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}