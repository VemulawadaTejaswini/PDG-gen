import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(input.readLine());
		long arr[] = new long[(int)n];
		String ae = input.readLine();
		StringTokenizer str = new StringTokenizer(ae);
		long a=0;
		while(str.hasMoreTokens()) {
			arr[(int)a] = Long.parseLong((String)str.nextElement());
			a++;
		}
		long t=0;
		if((arr[(int)n-2]^arr[(int)n-1])==arr[0]) {
			t++;
		}
		for(long i=0;i<n-2;i++){
			if(t>0 &&(arr[(int)i]^arr[(int)i+1])==arr[(int)i+2]) {
				t++;
			}
			else {
				break;
			}
		}
		if(t==n-1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
