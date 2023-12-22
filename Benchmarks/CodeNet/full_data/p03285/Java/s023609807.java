import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			final String s = reader.readLine();
			int n = Integer.parseInt(s);
			System.out.println(solve(n));
			
		}catch (Exception e) {
			
		}
	}

	
    
    static String solve(int n) {
    	for (int i = 0; i < 26; i++) {
    		for (int j = 0; j < 20; j++) {
    			if (4*i + 7*j == n) {
    				return "Yes";
    			}
    		}
    	}
    	return "No";
    }
    
    
}
