import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long n = Long.parseLong(br.readLine());
		long half = (long)Math.floor(n/2) + 1;
		for(long i = half; i > 0; i--){
			if(n%i==0){
				long a = n/i;
				int f = Math.max(String.valueOf(a).length(),String.valueOf(i).length());
				System.out.println(f);
				return;
			}
		}
	}
}