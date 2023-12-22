import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		Main myTools = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String haiku = br.readLine();

		haiku = haiku.replaceAll(",", " ");

		System.out.println(haiku);

	}


}