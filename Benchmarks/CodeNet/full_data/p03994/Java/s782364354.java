import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		String s = sc.next();
		int k = sc.nextInt();
		
		String alphabet ="abcdefghijklmnopqrstuvwxyz";
		char[] alpArr = alphabet.toCharArray();
		char[] word = s.toCharArray();
		
		for(int i = 0; i < word.length && k > 0; i++) {
			char thisChar = word[i];
			int thisCharIndex = thisChar - 'a';
			int idealJump = 'z' + 1 - thisChar;
			if (k >= idealJump) {
				k -= idealJump;
				word[i] = 'a';
			}
		}
		
		// we return if it is ideal 
		if (k == 0) {
			System.out.println(new String(word));
			return;
		}
		
		// we use all k starting from the back 
		int lastIndex = word.length - 1;
		char originalLastChar = word[lastIndex];
		int newCharIndex = (originalLastChar - 'a' + k) % 26;
		word[lastIndex] = alpArr[newCharIndex];
		System.out.println(new String(word));
			
		
	}
}