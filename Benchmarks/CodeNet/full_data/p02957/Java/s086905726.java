import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int A = Integer.parseInt(strArray[0]);
	int B = Integer.parseInt(strArray[1]);
	if ((A + B) % 2 == 0)
	    System.out.println((A + B) / 2);
	else
	    System.out.println("IMPOSSIBLE");
    }
}
