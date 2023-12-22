import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	if (str.equals("A")) {
    		System.out.println("T");
    	}
    	if (str.equals("T")) {
    		System.out.println("A");
    	}
    	if (str.equals("C")) {
    		System.out.println("G");
    	}
    	if (str.equals("G")) {
    		System.out.println("C");
    	}
    }
}