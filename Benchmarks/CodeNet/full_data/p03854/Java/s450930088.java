
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		while(str.length() != 0){
			if(str.matches("^(dreamer)+.*") && !str.startsWith("dreamerase")){
				while(str.matches("^(dreamer)+.*")){
					str = str.substring(7);
				}
			}else if(str.matches("^(eraser)+.*")){
				while(str.matches("^(eraser)+.*")){
					str = str.substring(6);
				}
			}else if(str.matches("^(dream)+.*")){
				while(str.matches("^(dream)+.*")){
					str = str.substring(5);
				}
			}else if(str.matches("^(erase)+.*")){
				while(str.matches("^(erase)+.*")){
					str = str.substring(5);
				}
			}else{
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}
