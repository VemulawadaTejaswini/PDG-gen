import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String list[] = br.readLine().split(" ");
	int count = 0;
	if (list[0].equals(list[1])) {
	    count++;
	}

	if (list[1].equals(list[2])) {
	    count++;
	}

	if (list[0].equals(list[2])) {
	    count++;
	}

	if (count == 1)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}