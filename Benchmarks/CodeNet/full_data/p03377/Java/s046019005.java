import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));

		String[] cd = vd.readLine().split(" ");
		int a = Integer.parseInt(cd[0]);
		int b = Integer.parseInt(cd[1]);
		int x = Integer.parseInt(cd[2]);

		if(x>=a&&x<(a+b)) System.out.println("YES");
		else System.out.println("NO");

	}

}
