import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int X = Integer.parseInt(line[1]);
		
		int lines = N*3;
		int sum = 0;
		int X2 = N-X;
		while(X2>0){
			lines = lines / N * X2;
			sum += lines;
			N -= X;
			X2 -= X;
		}
		
		System.out.println(sum);
	}
}
