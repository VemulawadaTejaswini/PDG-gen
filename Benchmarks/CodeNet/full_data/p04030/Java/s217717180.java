package atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			String s2 = String.valueOf(s.charAt(i));
			
			if (s2.equals("0") || s2.equals("1")) {
				sb.append(s2);
			} else if (s2.equals("B") && sb.length()>0) {
				sb.deleteCharAt(sb.length() -1);
			}

		}
		
		System.out.println(sb.toString());

	}

}