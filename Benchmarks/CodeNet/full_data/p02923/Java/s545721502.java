import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static int tc;
	static final int MOD=1_000_000_007;
	public static int[] inputArray(String str){
		String[] s=str.split(" ");
		int[] array=new int[s.length];
		for(int i=0;i<s.length;i++) {
			array[i]=Integer.parseInt(s[i]);
		}
		return array;
	}
	public static void main(String[] args)throws IOException {
		//tc=Integer.parseInt(br.readLine());
		tc=1;
		while(tc-->0) {
			int n=Integer.parseInt(br.readLine());
			int[] input=inputArray(br.readLine());
			int max=0,count=0;
			for(int i=0;i<n-1;i++) {
				if(input[i]>=input[i+1]) {
					count++;
					max=Math.max(max, count);
				}else {
					count=0;
				}
			}
			System.out.println(max);
		}
	}
}