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
			String[] s=br.readLine().split(" ");
			int A=Integer.parseInt(s[0]);
			int B=Integer.parseInt(s[1]);
			int multiply=0;
			int factor=1;
			while(multiply<B) {
				multiply=A*factor;
				factor++;
			}
			System.out.println(--factor);
		}
	}
}