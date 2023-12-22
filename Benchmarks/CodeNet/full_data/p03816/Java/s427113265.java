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
		String[] cardS = input2.split(" ");
				
		int unique = 1;
		String[] uniqueArray = new String[N];
		uniqueArray[0] = cardS[0];
		for(int i = 1; i < N; i++){
			int j =  0;
			for(; j < unique; j++)
				if(cardS[i].equals(uniqueArray[j]))
					break;
			if(j == unique) {
				uniqueArray[unique] = cardS[i];
				unique++;
			}	
		}
		if((N - unique)%2 == 1)
			System.out.print(unique - 1);
		else
			System.out.print(unique);
	}
}