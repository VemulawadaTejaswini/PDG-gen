import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		List<String> stringArr = Arrays.asList(input.split(""));
		
		int ans = 0;
		
		int lastB = stringArr.size();
		for(int i = stringArr.size() - 1; i >= 0; i--) {
			if(stringArr.get(i).contentEquals("B")) {
				
				ans += lastB - i - 1;
				lastB--;
				swap(i, lastB - 1, stringArr);
			}
		}
		
		System.out.println(ans);
	}
	
	public static void swap(int a, int b,List<String> strArr) {
		String aElm = strArr.get(a);
		String bElm = strArr.get(b);
		strArr.set(b, aElm);
		strArr.set(a, bElm);
	}
}
