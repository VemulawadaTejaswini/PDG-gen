import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = br.readLine();
		//Scanner scan = new Scanner(System.in);

	String[] ana = new String[4];
	ana = line.split(" ");
	String a =ana[1].substring(0,1);

				System.out.println("A" + a + "C");

	}
}
