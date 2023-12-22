import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){

			String[] l1 = input.readLine().split(" ");
			String[] l2 = input.readLine().split(" ");

			int ROW = Integer.parseInt(l1[0]);
			int COLUMN = Integer.parseInt(l1[1]);
			int r = Integer.parseInt(l2[0]);
			int c = Integer.parseInt(l2[1]);

			System.out.println((ROW - r) * (COLUMN - c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
