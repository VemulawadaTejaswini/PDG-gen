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
		Arrays.sort(str);
		sb.append("557".equals(str[0]+str[1]+str[2]) ? "YES" : "NO");
		System.out.println(sb);
	}
}