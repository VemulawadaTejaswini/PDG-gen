import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long x = Long.parseLong(str[2]);
		long sum = (a-1)/x;
		long sum2 = b/x;
		sb.append(sum2-sum);
		System.out.println(sb);
	}
}