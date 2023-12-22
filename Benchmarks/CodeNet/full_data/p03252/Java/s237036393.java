import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
	    char[] alphabet = new char[26];
	    char c = 'a';
	    for (int i = 0; i < 26; i++){
	        alphabet[i] = c++;
	    }
	    for (int i = 0; i < alphabet.length; i++) {
			int charCountS = charCounter(s, alphabet[i]);
			int charCountT = charCounter(t, alphabet[i]);
			if (charCountS > 0 && charCountT > 0 && charCountS != charCountT) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	static int charCounter(String str, char target){
		int count = 0;

		for(char x: str.toCharArray()){
			if(x == target){
				count++;
			}
		}
		return count;
	}
}