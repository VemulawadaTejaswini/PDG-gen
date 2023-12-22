import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	final int A = Integer.parseInt(str.split(" ")[0]);
    	final int B = Integer.parseInt(str.split(" ")[1]);
    	
    	int total = 0;
    	if (A >= B) {
    		total += A;
    	} else {
    		total += B;
    	}
    	
    	if (A >= B) {
    		total += A;
    	} else {
    		total += B;
    	}
    	
    	System.out.println(total);
    }	
}
