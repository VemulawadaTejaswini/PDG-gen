import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(input.readLine());
		ArrayList<Long> arr = new ArrayList<Long>((int)n);
		String ae = input.readLine();
		StringTokenizer str = new StringTokenizer(ae);
		long a=0;
		while(str.hasMoreTokens()) {
			arr.add(Long.parseLong((String)str.nextElement()));
			a++;
		}
		long t=0;
		if((arr.get((int)n-2)^arr.get((int)n-1))==arr.get(0)) {
			t++;
		}
		for(long i=0;i<n-2;i++){
			if(t>0 &&(arr.get((int)i)^arr.get((int)i+1))==arr.get((int)i+2)) {
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
