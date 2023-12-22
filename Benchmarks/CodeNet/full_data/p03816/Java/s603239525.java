import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input1 = "2";
		String input2 = "2 2 4";
		try {
			input1 = br.readLine();
			input2 = br.readLine();
		} catch (IOException e) {
		}
		
		int N = Integer.valueOf(input1);
		boolean[] B = new boolean[N];
		String[] cardS = input2.split(" ");
		long[] card = new long[N];
		for(int i = 0; i < N; i ++) {
			card[i] = Long.valueOf(cardS[i]);
			B[i] = false;
		}
		
		int out = 0;
		for(int i = 0; i < N; i++){
			if(B[i] == true)
				continue;
			B[i] = true;
			for(int j = i + 1; j < N; j++){
				if(card[i] == card[j]){
					B[j] = true;
					out++;
				}
			}
		}
		if(out%2 == 1)
			System.out.print(N - out - 1);
		else
			System.out.print(N - out);
	}
}
