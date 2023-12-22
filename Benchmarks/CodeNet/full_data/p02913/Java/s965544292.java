

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int l = 0;
		int r = n;

		String[] subRights = new String[n];
		for(int i = 0; i < n; i++){
			subRights[i] = str.substring(i);
		}

		while(r - l > 1){
			int mid = (l + r)/2;

			boolean hit = false;
			for(int i = 0; i <= n - 2*mid; i++){
				String subLeft = str.substring(i, i + mid);
				char[] leftArray = subLeft.toCharArray();
				char[] rightArray = subRights[i + mid].toCharArray();
//				String subRight = str.substring(i + mid);

//				if(subRight.contains(subLeft)){
//				if(subRights[i + mid].contains(subLeft)){
//				if(RKSearcher.indexOf(leftArray, rightArray) >= 0){
				if(BMSearcher.indexOf(rightArray, leftArray) >= 0){
					hit = true;
					break;
				}
			}

			if(hit){
				l = mid;
			}
			else {
				r = mid;
			}
		}

		System.out.println(l);
	}

}

class RKSearcher {
	private static final long q = 1000000007L;
	private static final int d = 64;

	public static int indexOf(char[] str1, char[] str2){
		int M = str1.length;
		int N = str2.length;
		long dM = 1;
		long h1 = 0;
		long h2 = 0;

		//?????????????????°???????????????equals???????????°??????
		if(M == N){
			if(new String(str1).equals(new String(str2))){
				return 0;
			}
			else {
				return -1;
			}
		}

		else if (M > N){
			return -1;
		}

		for(int i = 1; i < M ; i++){
			dM = (d*dM)%q;
		}

		for(int i = 0; i < M; i++){
			h1 = (h1*d + index(str1[i])) % q;
			h2 = (h2*d + index(str2[i])) % q;
		}
		int i;
		for(i = 0; h1 != h2 ;i++){
			//System.out.println("i = "+i+" h1 "+h1+" h2 "+h2);
			h2 = (h2 + d*q - index(str2[i])*dM) % q;
			if(i+M >= N){
				return -1;
			}
			h2 = (h2*d + index(str2[i+M])) % q;
			if (i > N-M){
				return -1;
			}
		}
		return i;
	}

	private static int index(char c){
		//return c - '0' + 1;
		//??°??????0~9
		if(c >=  '0' && c <= '9'){
			return c - '0';
		}
		//?°??????????10~35
		else if (c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		}
		//??§?????????36~61
		else if (c >= 'A' && c <= 'Z'){
			return c - 'A' + 36;
		}
		else {
			return -1;
		}
	}
}

class BMSearcher {
	public static int indexOf(char[] str1, char[] str2){
		if (str2.length == 0){
			return 0;
		}

		int charTable[] = makeCharTable(str2);
		int offsetTable[] = makeOffsetTable(str2);
		for(int i = str2.length - 1, j; i < str1.length ;){
			for(j = str2.length - 1; str2[j] == str1[i] ; i--, j--){
				if(j == 0){
					return i;
				}
			}

			i += Math.max(offsetTable[str2.length - 1 - j], charTable[str1[i]]);

		}
		return -1;
	}

	private static int[] makeCharTable(char[] str) {
		final int ALPHABET_SIZE = 256;
		int[] table = new int[ALPHABET_SIZE];
		for(int i = 0; i < table.length ; i++){
			table[i] = str.length;
		}
		for(int i = 0; i < str.length - 1; i++){
			table[str[i]] = str.length - 1 - i;
		}
		return table;
	}

	private static int[] makeOffsetTable(char[] str){
		int[] table = new int[str.length];
		int lastPrefixPosition = str.length;
		for(int i = str.length - 1; i >= 0; i--){
			if(isPrefix(str, i + 1)) {
				lastPrefixPosition = i + 1;
			}
			table[str.length - 1 - i] = lastPrefixPosition - i + str.length - 1;
		}
		for(int i = 0; i < str.length - 1; i++){
			int slen = suffixLength(str, i);
			table[slen] = str.length - 1 - i + slen;
		}
		return table;
	}

	private static boolean isPrefix(char[] str, int p){
		for (int i = p, j = 0; i < str.length; i++, j++){
			if(str[i] != str[j]){
				return false;
			}
		}
		return true;
	}

	private static int suffixLength(char[] str, int p){
		int len = 0;
		for(int i = p, j = str.length - 1;
				i >= 0 && str[i] == str[j]; i--, j--){
			len += 1;
		}
		return len;
	}
}
