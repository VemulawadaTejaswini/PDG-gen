import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	public void start() {
		Scan sc = new Scan();
		String inputs[] = new String[3];
		for (int i = 0; i < 3; i++) {
			inputs[i] = sc.next();
		}
		

		System.out.println(getResult(inputs));

	}

	private String getResult(String[] inputs) {
		for (int i = 1; i < inputs.length; i++) {
			if(inputs[i-1].charAt(inputs[i-1].length()-1)!=inputs[i].charAt(0)){
				return "NO";
			}
		}
		return "YES";
	}

}
class Scan {
	BufferedReader br;
	StringTokenizer st;

	public Scan() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

}