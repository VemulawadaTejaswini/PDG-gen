import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
			String s = br.readLine();
			int N = Integer.valueOf(s);
			if (N < 1 || N > 100)
				System.exit(0);
			
			int max = 0; 
			int maxNum = 0;
			for (int i = 1; i <= N; i++) {
				int num = calc(i);
				if (maxNum < num) {
					max = i;
					maxNum = num;
				}
			}
			System.out.println(max);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static int calc(int N) {
		int i = 0;
		while (N % 2 == 0) {
			N = N / 2;
			i++;
		}
		return i;
	}