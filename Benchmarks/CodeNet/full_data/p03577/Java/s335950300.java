
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		
		String s=br.readLine();
		System.out.println(s.substring(0, s.length()-8));

	}

}
