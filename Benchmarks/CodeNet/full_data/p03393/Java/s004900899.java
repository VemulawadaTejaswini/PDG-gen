import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		
		boolean used[] = new boolean[26];
		
		for(int i = 0; i < input.length(); i++){
			used[input.charAt(i) - 'a'] = true;
		}
		
		int prev = 0;
		for(int i = input.length() - 1; i >= -1 ; i--){
			for(int j = prev; j < 26 ; j++){
				if(!used[j]){
					System.out.println(input+(char)(j + 'a'));
					return;
				}
			}
			
			if(input.length() == 0){
				break;
			}
			prev = input.charAt(input.length() - 1) - 'a' + 1;
			used[input.charAt(input.length() - 1) - 'a'] = false;
			
			input = input.substring(0, input.length() - 1);
		}
		
		System.out.println(-1);
	}
	
}

