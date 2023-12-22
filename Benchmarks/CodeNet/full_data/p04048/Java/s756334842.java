import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String [] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int X = Integer.parseInt(input[1]);
		int result = 0;

		if(N == X || X == 0) {
			result = 0;
		}else if((double)N/2 == X && (N%2)==0) {
			result = 3*X;
		}else if((double)N/2 <= X) {
			result = X + (N-X)*(X+1);
		}else {
			result = X + (N-X) +  2*X + ((N-X) -X)*(X+1);
		}
		System.out.println(result);
	}

}
