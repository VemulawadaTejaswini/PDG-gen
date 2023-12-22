import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	if(str.charAt(2) == str.charAt(3))
		if(str.charAt(4) == str.charAt(5)) {
			System.out.println("Yes");
          return;
		}
   
    System.out.println("No");
       }
}