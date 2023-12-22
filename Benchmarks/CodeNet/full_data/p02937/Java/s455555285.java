

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		String t = br.readLine();

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		int i = 0;
		long result = 0;
		while(i < t.length()){
			boolean hit = false;
			for(int j = 0; j < s.length(); j++){
				result++;

				if(sArray[j] == tArray[i]){
					hit = true;
					i++;
					if(i == t.length()){
						break;
					}
				}
			}

			if(!hit){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(result);
	}

}
