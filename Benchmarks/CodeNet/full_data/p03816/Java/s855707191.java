import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input1;
		String input2;
		try {
			input1 = br.readLine();
			input2 = br.readLine();
		} catch (IOException e) {
			return;
		}
		int N = Integer.valueOf(input1);
		String[] cardS = input2.split(" ");
		
		int out = 0;
		for(int i = 0; i < N; i++){
			for(int j = i + 1; j < N; j++){
				if(cardS[i].equals(cardS[j])){
					out++;
					break;
				}
			}
		}
		if(out%2 == 1)
			System.out.print(N - out - 1);
		else
			System.out.print(N - out);
	}
}
