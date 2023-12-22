
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int n = Integer.parseInt(as[0]);
		int a = Integer.parseInt(as[2]);
		int b = Integer.parseInt(as[1]);
		int sum = 0;
		int bSum = 0;
		while(sum <= n) {
			if(sum + b >= n) {
				bSum += n - sum;
				break;
			}
			bSum += b;
			sum += b;sum += a;
			if(sum >= n) {
				break;
			}
			
		}
		System.out.println(bSum);
	}

}
