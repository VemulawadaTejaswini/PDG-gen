import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String SandT[] = br.readLine().split(" ");
	String S = SandT[0];
	String T = SandT[1];
	String AandB[] = br.readLine().split(" ");
	int A = Integer.parseInt(AandB[0]);
	int B = Integer.parseInt(AandB[1]);
	String U = br.readLine();
	if (U.equals(S))
	    System.out.println((A - 1) + " " + B);
	else if (U.equals(T))
	    System.out.println(A + " " + (B - 1));
    }
}
