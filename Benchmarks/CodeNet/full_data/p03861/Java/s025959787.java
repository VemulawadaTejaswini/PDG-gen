
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		long a = Long.parseLong(strlist[0]);
		long b = Long.parseLong(strlist[1]);
		long x = Long.parseLong(strlist[2]);

		long max = b / x;
		long count = 0;

		for(int i=0; i<=max; i++){
			if(x*i >= a && x*i <= b){
				count = count+1;
			}
		}

		System.out.println(count);

	}

}
