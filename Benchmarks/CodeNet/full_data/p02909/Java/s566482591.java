import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader stdin = getStdin();
		String s = stdin.readLine();
		switch (s) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		default:
			System.out.println("Sunny");
			break;
		}
	}
	
	public static BufferedReader getStdin() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		return stdin;
	}

}