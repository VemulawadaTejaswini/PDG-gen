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
		int[] t = new int [n];
		int[] a = new int [n];
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			t[i] = Integer.parseInt(str[0]);
			a[i] = Integer.parseInt(str[1]);
		}
		long gt = 1l*t[0];
		long ga = 1l*a[0];
		for(int i = 1; i < n; i++){
			long nt = 1l*t[i];
			long na = 1l*a[i];
			if(ga>gt || (ga==gt && na<nt)){
				while(ga%na!=0){
					ga++;
				}
				gt = 1l*nt*(ga/na);
			}else{
				while(gt%nt!=0){
					gt++;
				}
				ga = 1l*na*(gt/nt);
			}
		}
		sb.append(ga+gt);
		System.out.println(sb);
	}
}