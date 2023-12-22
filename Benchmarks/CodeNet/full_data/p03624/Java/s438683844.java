import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] chars = S.toCharArray();
		Arrays.sort(chars);
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
						 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int j =0;
		for(int i=0; i<chars.length; i++) {
			if(chars[i] == alphabets[j]) {
				if(i+1==26) {
					break;
				}
				if(chars[i+1] != alphabets[j]) {
					j++;
				} else {
					;
				}
			} else {
				System.out.println(alphabets[j]);
				return;
			}
		}
		System.out.println("None");
	}

}
