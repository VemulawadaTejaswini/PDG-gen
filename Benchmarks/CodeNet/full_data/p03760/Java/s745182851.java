
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String oStr = input.readLine( );
		String[] oList = oStr.split("");
		String eStr = input.readLine( );
		String[] eList = eStr.split("");

		for(int i=0; i<oStr.length(); i++){
			System.out.print(oList[i]);
			System.out.print(eList[i]);
		}
		System.out.println();
	}

}
