
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] nab = str.split(" ");
		int n = Integer.parseInt(nab[0]);
		int a = Integer.parseInt(nab[1]);
		int b = Integer.parseInt(nab[2]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			str = input.readLine();
			list.add(Integer.parseInt(str));

		}

		Collections.sort(list, Comparator.reverseOrder());

		System.out.println(list.get(0) / a);
	}
}
