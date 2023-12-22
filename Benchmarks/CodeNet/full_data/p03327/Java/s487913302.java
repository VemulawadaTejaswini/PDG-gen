import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			return;
		}
		
		String name = null;
		if (n >= 1000) {
			name = "ABD";
			n++;
			n %= 1000;
		} else {
			name = "ABC";
		}
		
		String ns = "00" + n;
		name += ns.substring(ns.length() - 3);
		
		System.out.println(name);
	}
}
