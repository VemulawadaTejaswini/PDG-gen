import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int A, B, C, result;
	A = Integer.parseInt(strArray[0]);
	B = Integer.parseInt(strArray[1]);
	C = Integer.parseInt(strArray[2]);
	result = C - (A - B);
	System.out.println(result >= 0 ? result : 0);

    }
}