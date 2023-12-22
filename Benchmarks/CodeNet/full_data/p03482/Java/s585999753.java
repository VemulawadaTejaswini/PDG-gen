import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = in.readLine().toCharArray();
		int best = (arr.length / 2) + (arr.length % 2);
		char l = '-';
		int c = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == l) {
				c++;
				if(c > best) best = c;
			} else {
				c = 1;
			}
			l = arr[i];
		}
		System.out.println(best);
	}
}