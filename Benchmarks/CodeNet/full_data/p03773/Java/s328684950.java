
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");

		if(list[0].equals("H")){
			if(list[1].equals("H")){
				System.out.println("H");
			}else{
				System.out.println("D");
			}
		}else{
			if(list[1].equals("H")){
				System.out.println("D");
			}else{
				System.out.println("H");
			}
		}

	}

}
