
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 try {
			 ArrayList<Integer> list = new ArrayList<Integer>();
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		
			 final int N = br.read();
			 
			 for (int i = 0; i < N; i++) {
				list.add(br.read());
			 }
			
			 System.out.println(lcm(list));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int lcm(ArrayList<Integer> list) {
		if (list.size() < 1)
			return 1;
		int a = list.get(0);
		list.remove(0);
		return lcm(a, lcm(list));
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
