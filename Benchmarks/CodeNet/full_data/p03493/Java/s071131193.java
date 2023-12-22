import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test081 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '1') count++;
		}
		System.out.println(count);
		
		
	}

}
