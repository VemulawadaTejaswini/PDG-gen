import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			String[] inputString = br.readLine().split(" ");
			int[] input = new int[inputString.length];
			for(int i = 0 ; i < inputString.length ; i++){
				input[i] = Integer.parseInt(inputString[i]);
			}
			int result = 0;
			int base = input[0];
			if(base == 0){
				base = (input[1] > 0)? -1 : 1;
			}
			for(int i = 1 ; i < input.length ; i++){
				int temp = base;
				base += input[i];
				if(temp*base >= 0){
					result += Math.sqrt(base*base)+1;
					base = (temp > 0)? -1 : 1;
				}
			}
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}