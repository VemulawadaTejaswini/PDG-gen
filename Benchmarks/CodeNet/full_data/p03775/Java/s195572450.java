import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		long n = Long.parseLong(input.readLine( ));
		long a = 1;
		long b = 1;
		long answer = String.valueOf(n).length();

		while(a < Math.sqrt(n)){
			if(n%a == 0){
				b = n / a;
				if(answer > String.valueOf(a).length() && String.valueOf(a).length() > String.valueOf(b).length()){
					answer = String.valueOf(a).length();
				}else if(answer > String.valueOf(b).length() && String.valueOf(b).length() > String.valueOf(a).length()){
					answer = String.valueOf(b).length();
				}
			}
			a++;
		}
		System.out.println(answer);
	}
}