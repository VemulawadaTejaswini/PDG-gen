import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		while(str.length() != 0){
			while(str.startsWith("dreamer") && !str.startsWith("dreamerase")){
				str = str.substring(7);
			}
			while(str.startsWith("eraser")){
				str = str.substring(6);
			}
			while(str.startsWith("dream") || str.startsWith("erase")){
				str = str.substring(5);
			}
			if(!str.contains("dream") && !str.contains("erase")){
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}