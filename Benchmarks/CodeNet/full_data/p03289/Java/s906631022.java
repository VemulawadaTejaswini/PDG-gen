import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] agrs) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String input = bufferedReader.readLine();
		char[] inputArray = input.toCharArray();
		int lengthOfInput = input.length();
				
		char first = inputArray[0];
		boolean condition1 = Character.isUpperCase(first);
		
		if(!condition1) {
			print("WA");
		}
		
		int numberOfC = 0;
		int cAt = 0;
		boolean condition2 = false;
		
		for (int a = 2; a <= lengthOfInput - 2; a++) {
			if(inputArray[a] == 'C') {
				if(numberOfC == 0) {
					condition2 = true;
					cAt = a;
				}else {
					condition2 = false;
					break;
				}
			}
		}
		
		if(!condition2) {
			print("WA");
		}
		
		boolean condition3 = false;
		
		if(condition1 && condition2) {
			for(int a = 0; a < lengthOfInput; a++) {
				if(a != 0 && a != cAt) {
					condition3 = Character.isLowerCase(inputArray[a]);
					if(!condition3) {
						break;
					}
				}
			}
			
			if(!condition3) {
				print("WA");
			}
		}
		
		if(condition1 && condition2 && condition3) {
			print("AC");
		}
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
	
}
