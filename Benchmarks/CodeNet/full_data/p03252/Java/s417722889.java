import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();

		// 計算
		String result = "Yes";
		int[] arrayS = new int[26];
		int[] arrayT = new int[26];
		int index = 0;
		for(char c = 'a'; c <= 'z'; c++){
		    for(int i = 0; i < s.length(); i++){
		        if(s.charAt(i) == c) arrayS[index]++;
		        if(t.charAt(i) == c) arrayT[index]++;
		    }
		    index++;
		}
		Arrays.sort(arrayS);
		Arrays.sort(arrayT);
		for(int i = 0; i < 26; i++){
		    if(arrayS[i] != arrayT[i]) result = "No";
		}
		
		// 出力
		System.out.println(result);
		
	}
}
