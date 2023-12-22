
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String st = "SSSSSSSSSSTTTTTTTTTT";

		while(str.contains("ST")){
			if(str.contains(st)){
				str = str.replace(st, "");
			}else{
				str = str.replace("ST", "");
			}
		}

		System.out.println(str.length());

	}
}
