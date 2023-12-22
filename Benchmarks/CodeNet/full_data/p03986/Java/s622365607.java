package agc0.agc005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainA {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		while(str.contains("ST")){
			str = str.replace("ST", "");
		}

		System.out.println(str.length());

	}
}
