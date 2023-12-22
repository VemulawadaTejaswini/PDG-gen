import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
		
	}
	
	private static void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		ArrayList<Set> list = new ArrayList<Set>();
		
		for (int i = 0; i < N; ++i) {
			String str = reader.readLine();
			
			int a = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			int b = Integer.parseInt(str.substring(str.indexOf(" ") + 1, str.length()));
			
			list.add(new Set(a, b));
		}
		
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				
				int a = list.get(i).a + list.get(j).a;
				int b = list.get(i).b + list.get(j).b;
				int c = a + b;
				
				int max = Math.max(a, b);
				
				int lim = c - a + 1;
				int top = 1;
				int bottom = 1;
				while (c >= lim) {
					top *= c--;
				}
				while (max >= 1) {
					bottom *= max--;
				}
				
				sum += top / bottom;
				
			}
		}
		
		System.out.println(sum);
		
	}
	
	private static class Set {
		int a = 0;
		int b = 0;
		
		public Set(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
}
