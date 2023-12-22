import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String [] input = br.readLine().split(" ");
		long N = Long.parseLong(input[0]);
		long X = Long.parseLong(input[1]);
		long result = 0;
		long NX = N-X;
		if((double)N/2 == X) {
			result = 3*X;
		}else if((double)N/2 <= X) {
			long first = NX;
			long second = N%first;
			long count = N/first;
			result = X + first*(count+1) + second * (first/(second)+1);
		}else {
			result = X + (NX) +  2*(N-NX) + (NX - (N-NX))*X+1;
		}
		System.out.println(result);
	}
}