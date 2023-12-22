import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] d = new int [n];
		for(int i = 0; i < n; i++){
			d = Integer.parseInt(str[i]);
		}
		int m = Integer.parseInt(br.readLine());
		String[] str2 = br.readLine().split(" ");
		int[] t = new int[m];
		for(int i = 0; i < m; i++){
			t = Integer.parseInt(str2[i]);
		}
		Arrays.sort(d);
		Arrays.sort(t);
		for(int i = 0; i < m; i++){
			boolean done = false;
			for(int j = 0; j < n; j++){
				if(t[i]==d[j]){
					d[j] = 0;
					done = true;
					break;
				}
			}
			if(!done){
				System.out.println("NO");
			}
		}
		System.out.println("YES");
	}
}