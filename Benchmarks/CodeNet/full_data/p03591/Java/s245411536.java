import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				char output = 'R';
				int x = i/d;
				int y = j/d;
				if(x % 2 == 0) {
					if(y % 2 == 0) {
						output = 'R';
					} else {
						output = 'Y';
					}
				} else {
					if(y % 2 == 0) {
						output = 'G';
					} else {
						output = 'B';
					}
				}
				System.out.print(output);
			}
			System.out.println();
		}
	}
}
