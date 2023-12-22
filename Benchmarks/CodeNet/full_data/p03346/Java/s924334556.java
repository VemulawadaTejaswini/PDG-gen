import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] ar=new int[N];
		for(int i=0;i<N;i++){
			ar[ Integer.parseInt(br.readLine()) - 1] = i;
		}
		int max = 0, start = 0;
		for(int i=1 ; i < N;i++){
			if(ar[i] > ar[i-1]){
				max = Math.max(max, i - start + 1);
			}else{
				start = i;
			}
		}
		System.out.println(N - max);
	}
}