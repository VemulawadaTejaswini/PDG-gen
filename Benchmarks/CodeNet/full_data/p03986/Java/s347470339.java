
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String before = "";
		String after = "";

		while(str.contains("ST")){
			before = str.substring(0, str.indexOf("ST"));
			after = str.substring(str.indexOf("ST")+2, str.length());
			str = before + after;
		}

		System.out.println(str.length());

	}
}
