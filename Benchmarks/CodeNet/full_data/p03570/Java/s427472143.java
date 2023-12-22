import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int len = input.length();
		
		int result = solve(input);
		System.out.println(result);
	}
	
	static int solve(String str){
		if(isPalindon(str)){
//			System.out.println("palindon!");
			return 1;
		}
		
		int len = str.length();
		
		int used = usedCharType(str);
		if(used == 1){
			return 1;
		}
		else if(used == len){
			return used;
		}
		
		
		
		int result = Integer.MAX_VALUE;
		for(int i = 1; i < len; i++){
			String str1 = str.substring(0, i);
			String str2 = str.substring(i, len);
			int tmp = solve(str1) + solve(str2);
			
			if(tmp < result){
//				System.out.println("str "+str+" str1 "+str1+" str2 "+str2+" i "+i+" tmp "+tmp);
				result = tmp;
			}
		}
		
		return result;
	}
	
	static int usedCharType(String str){
		char[] alpha = new char[26];
		
		int len = str.length();
		for(int i = 0; i < len ; i++){
			alpha[str.charAt(i)-'a']++;
		}
		
		int used = 0;
		for(int i = 0; i < 26; i++){
			if(alpha[i] > 0){
				used++;
			}
		}
		
		return used;
	}
	
	static boolean isPalindon(String str){
		char[] alpha = new char[26];
		
		int len = str.length();
		for(int i = 0; i < len ; i++){
			alpha[str.charAt(i)-'a']++;
		}
		
		int odd = 0;
		for(int i = 0; i < 26; i++){
			if(alpha[i] % 2 == 1){
				odd++;
				if(odd >= 2){
					return false;
				}
			}
		}
		
		return true;
	}

}
