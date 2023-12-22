import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String[] stringArr = input.split("");
		
		int ans = 0;
		int wCnt = 0;
		
		for(int i = stringArr.length - 1; i >= 0; i--) {
			if(stringArr[i].equals("B")) {
				ans += wCnt;
			}else {
				wCnt++;
			}
		}
		
		System.out.println(ans);
	}
	
//	public static void swap(int a, int b,List<String> strArr) {
//		String aElm = strArr.get(a);
//		String bElm = strArr.get(b);
//		strArr.set(b, aElm);
//		strArr.set(a, bElm);
//	}
}
