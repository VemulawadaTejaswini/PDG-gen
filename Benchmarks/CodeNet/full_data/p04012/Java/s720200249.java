import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		Map<Character,Integer> alphabet = new TreeMap<Character,Integer>();
		for(char x = 'a'; x <= 'z'; x++) {
			alphabet.put(x,0);
		}
		for(int i = 0; i < w.length(); i++) {
			char temp = w.charAt(i);
			int num = alphabet.get(temp)+1;
			alphabet.put(temp,num);
		}
		for(char i:alphabet.keySet()){
			if(alphabet.get(i)%2!=0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
