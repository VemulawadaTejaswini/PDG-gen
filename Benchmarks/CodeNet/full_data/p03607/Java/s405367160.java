import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(in.readLine());
		ArrayList<String> d = new ArrayList<String>();
		String s;
		for(int i = 0; i < n; i++) {
			s = in.readLine();
			if(!d.contains(s)) {
				d.add(s);
			}else {
				d.remove(s);
			}
		}
		System.out.print(d.size());
	}
}