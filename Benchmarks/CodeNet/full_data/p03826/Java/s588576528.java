
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int a = Integer.parseInt(strlist[0]);
		int b = Integer.parseInt(strlist[1]);
		int c = Integer.parseInt(strlist[2]);
		int d = Integer.parseInt(strlist[3]);

		if(a*b > b*c){
			System.out.println(a*b);
		}else{
			System.out.println(c*d);
		}

	}

}
