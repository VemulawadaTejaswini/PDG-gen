
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");
		
		int input[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		int target = 1;
		int length = 0;
		for(int i = 0; i < n; i++) {
			if(input[i] == target) {
				target++;
				length++;
			}
		}
		
		System.out.println(length > 0 ? n - length : -1);
	}
}
