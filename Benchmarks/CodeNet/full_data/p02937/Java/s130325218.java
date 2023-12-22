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
		long result = 0;
		/*
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t.length(); i++){
		    sb.append(s);
		}
		String str = sb.toString();
		*/
		int currentIndex = -1;
		long loop = 0;
		for(int i = 0; i < t.length(); i++){
		    int preIndex = currentIndex;
		    currentIndex = s.indexOf(t.charAt(i), currentIndex + 1);
		    if(currentIndex == -1){
		        loop++;
		        currentIndex = s.indexOf(t.charAt(i), currentIndex + 1);
		    }
		    if(currentIndex == -1){
		        result = -1;
		        break;
		    }else{
		        result = loop * s.length() + currentIndex + 1;
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}
