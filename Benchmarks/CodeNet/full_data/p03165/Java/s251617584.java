import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char[] str1 = s.next().toCharArray();
		char[] str2 = s.next().toCharArray();
		
		if(str1.length > str2.length) {
			char[] tmp = str1;
			str1 = str2;
			str2 = tmp;
		}
		
		int[][] dp = new int[3000][3000];
		
		dp[0][0] = str1[0] == str2[0] ? 1: 0;
		
		for(int i = 1; i < str2.length; i++) {
			if(str1[0] == str2[i]) {
				dp[0][i] = 1;
			}else {
				dp[0][i] = dp[0][i-1];
			}
		}
		for(int i = 1; i < str1.length; i++) {
			if(str2[0] == str1[i]) {
				dp[i][0] = 1;
			}else {
				dp[i][0] = dp[i-1][0];
			}
		}
		
		for(int i = 1; i < str1.length; i++) {
			for(int j = 1; j < str2.length; j++) {
				if(str1[i]==str2[j]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		
		StringBuilder ret = new StringBuilder();
		int i = str1.length - 1;
		int j = str2.length - 1;
		while(i >= 0 && j >= 0) {
			if(str1[i] == str2[j]) {
				ret.insert(0, str1[i]);
				--i;--j;
			}else {
				if(i < 1) {
					j--;
				}else if(j < 1) {
					i--;
				}
				else if(dp[i-1][j] > dp[i][j-1]) {
					--i;
				}else {
					--j;
				}
			}
		}
		System.out.println(ret.toString());
    }
}
