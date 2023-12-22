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
		long cnt = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			int v = Integer.parseInt(br.readLine());
			if(v==0){
				a[i] = 0;
				continue;
			}
			int e = v%2==0 ? v/2 -1 : v/2;
			cnt += e;
			a[i] = v-e*2;
		}
		for(int i = 1; i < n-1; i++){
			int v1 = a[i-1];
			int v2 = a[i];
			int v3 = a[i+1];
			if(v1>0 && v2>0){
				v1--;
				v2--;
				a[i-1]--;
				a[i]--;
				cnt++;
			}
			if(v1>0 && v2>0){
				v1--;
				v2--;
				a[i-1]--;
				a[i]--;
				cnt++;
			}
			if(v2>0 && v3>0){
				v2--;
				v3--;
				a[i]--;
				a[i+1]--;
				cnt++;
			}
			if(v2>0 && v3>0){
				v2--;
				v3--;
				a[i]--;
				a[i+1]--;
				cnt++;
			}
		}
		for(int i = 0; i < 	n; i++){
			if(a[i]==2)
				cnt++;
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}