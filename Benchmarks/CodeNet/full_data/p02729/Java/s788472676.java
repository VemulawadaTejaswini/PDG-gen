import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int N = Integer.parseInt(strArray[0]);
	int M = Integer.parseInt(strArray[1]);
	int sum = 0;
	for (int i = 1; i < N; i++) {
	    sum += i;
	}
	for (int i = 1; i < M; i++) {
	    sum += i;
	}
	System.out.println(sum);
    }
}