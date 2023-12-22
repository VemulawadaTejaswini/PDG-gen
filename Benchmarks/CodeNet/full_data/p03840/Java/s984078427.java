import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bf.readLine().split(" ");
		long rta = 0;
		rta +=Long.parseLong(data[1]);
		long l = Long.parseLong(data[3]);
		rta += l-(l%2);
		l = Long.parseLong(data[4]);
		rta += l-(l%2);
		l = Long.parseLong(data[0]);
		rta += l-(l%2);
		System.out.println(rta);
	}
}
