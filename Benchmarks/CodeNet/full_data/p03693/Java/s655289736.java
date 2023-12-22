
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] rgb = str.split(" ");
		int g = Integer.parseInt(rgb[1]);
		int b = Integer.parseInt(rgb[2]);

		if((g*10+b)%4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}


	}

}
