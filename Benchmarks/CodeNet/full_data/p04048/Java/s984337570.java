import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static BitSet[] b;
	static int n;

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		long n = Long.parseLong(str[0]);
		long x = Long.parseLong(str[1]);
		sb.append(4*(n-x));
		System.out.println(sb);
	}
}