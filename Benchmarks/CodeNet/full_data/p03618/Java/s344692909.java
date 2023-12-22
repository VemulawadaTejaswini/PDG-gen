import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		long[] charCount = new long[26];
		long n = input.length();
		
		for(int i = 0; i < input.length() ; i++){
			charCount[input.charAt(i)-'a']++;
		}
		
		long result = 0;
		
		result = n*(n-1)/2;
		for(int i = 0; i < charCount.length ; i++){
			if(charCount[i] >= 2){
				result -= charCount[i]*(charCount[i] - 1)/2;
			}
		}
		
		result++;
		System.out.println(result);
	}

}
