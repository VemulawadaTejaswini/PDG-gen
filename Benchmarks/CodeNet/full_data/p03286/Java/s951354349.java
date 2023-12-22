import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
 
		if (n == 0) {
			System.out.println(0);
			return;
		}
 
		List<Integer> list = new ArrayList<>();
		while (n != 1) {
			if (n < 0) {
				list.add(-n % 2);
				n = (-n + 1) / 2;
			} else {
				list.add(n % 2);
				n = -(n / 2);
			}
		}
		System.out.print(1);
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i);
		}
		System.out.println();
	}
}