import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		InputReader in = new InputReader(System.in);
		int n = in.readInt();  
		long arr[] = new long[87]; 
		arr[0] = 2; 
		arr[1] = 1;
		for(int i = 2; i<=n; i++) {
			arr[i] = arr[i-2] + arr[i-1]; 
		}
		System.out.println(arr[n]);
	}
}