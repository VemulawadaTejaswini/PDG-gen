import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int p500 = x / 500;
		int p5 = (x - 500*p500) / 5;
		
		System.out.println(String.format("%d", p500*1000 + p5*5));
	}

}