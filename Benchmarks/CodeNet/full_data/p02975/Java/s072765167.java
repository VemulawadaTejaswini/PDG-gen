import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.lang.*;

class circle_xor {

	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		int arr[] = new int[n];
		String ae = input.readLine();
		StringTokenizer str = new StringTokenizer(ae);
		int a=0;
		while(str.hasMoreTokens()) {
			arr[a] = Integer.parseInt((String)str.nextElement());
			a++;
		}
		int t=0;
		if((arr[n-2]^arr[n-1])==arr[0]) {
			t++;
		}
		for(int i=0;i<n-2;i++){
			if(t>0 &&(arr[i]^arr[i+1])==arr[i+2]) {
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
