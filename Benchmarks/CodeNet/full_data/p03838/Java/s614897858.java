import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s =new StringTokenizer(in.readLine(), " ");
		
		int x = Integer.parseInt(s.nextToken());
		int y = Integer.parseInt(s.nextToken());
		
		int c = Math.abs(Math.abs(x) - Math.abs(y));
		
		if(x < 0 && y < 0) c += 2;
		if(x >= 0 && y < 0 || x < 0 && y > 0) c++;
		
		System.out.println(c);
	}
}
