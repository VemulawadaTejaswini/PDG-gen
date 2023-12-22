import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split(" ");
		read[0] = read[0].substring(0,1);
		read[1] = read[1].substring(0,1).toUpperCase();
		read[2] = read[2].substring(0,1);
		System.out.println(read[0] + read[1] + read[2]);
	}
}