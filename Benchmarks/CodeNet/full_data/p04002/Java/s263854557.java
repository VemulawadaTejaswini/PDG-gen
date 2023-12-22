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
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int n = Integer.parseInt(str[2]);
		BitSet bs = new BitSet(h*w);
		for(int i = 0; i < n; i++){
			String[] str1 = br.readLine().split(" ");
			int a = Integer.parseInt(str1[0]) - 1;
			int b = Integer.parseInt(str1[1]) - 1;
			bs.set(a*w+b);
		}
		long[] cnt = new long[10];
		int bmass;
		for(int i = 0; i < h-2; i++){
			for(int j = 0; j < w-2; j++){
				bmass = bs.get(i*w+j,i*w+3+j).cardinality()
						+ bs.get((i+1)*w+j,(i+1)*w+3+j).cardinality()
						+ bs.get((i+2)*w+j,(i+2)*w+3+j).cardinality();
				cnt[bmass]++;
			}
		}
		for(int i = 0; i < 10; i++){
			sb.append(cnt[i]).append("\n");
		}
		System.out.print(sb);
	}
}