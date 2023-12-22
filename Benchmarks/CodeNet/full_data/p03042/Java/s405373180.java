import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		int f = Integer.parseInt(S.substring(0, 2));
		int s = Integer.parseInt(S.substring(2, 4));
		in.close();
		if( 1 <= f && f <= 12) {
			if(1 <= s && s <= 12) {
				System.out.println("AMBIGUOUS");				
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(1<=s && s <= 12) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}
		
	}

}
