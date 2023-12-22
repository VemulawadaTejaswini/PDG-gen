import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
			long n = Integer.parseInt(br.readLine());
			double sqrtN = Math.sqrt(n);
			int min = String.valueOf(n).length();

			for(int i=1; i <= sqrtN; i++){
				if(n % i == 0) min = Math.min(min, String.valueOf(n / i).length());
			}
			System.out.println(min);
		}catch(IOException e){
			e.printStackTrace();

		}

	}
}