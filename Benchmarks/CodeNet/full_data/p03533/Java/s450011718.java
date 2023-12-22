import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		try {
			s = br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(9 < s.length()) {
			System.out.println("NO");
			return;
		}
		
		Pattern p = Pattern.compile("^A?KIHA?BA?RA?");
		if ( p.matcher(s).find() ) System.out.println("YES");
		else System.out.println("NO");
	}
}