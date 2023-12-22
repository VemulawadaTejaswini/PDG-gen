import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
	
	final static String SUNNY = "Sunny";
	final static String CLOUDY = "Cloudy";
	final static String RAINY = "Rainy";
	
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		String weather = os.next();
		String next = null;
		
		switch (weather) {
			case SUNNY:
				next = CLOUDY;
				break;
			case CLOUDY:
				next = RAINY;
				break;
			case RAINY:
				next = SUNNY;
				break;
		}
		pw.println(next);
		pw.close();
	}
    
	static class OriginScanner {
		StringTokenizer token;
		BufferedReader br;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		
		String next() {
			while (token == null || !token.hasMoreElements()) { 
				token = new StringTokenizer(nextLine());
			}
			return token.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}