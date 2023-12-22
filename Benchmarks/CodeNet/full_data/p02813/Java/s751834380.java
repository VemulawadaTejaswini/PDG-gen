import java.util.*;
import java.io.*;

public class Main {
	
	static int N;

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		String[] P = br.readLine().split(" ") ; 
		String[] Q = br.readLine().split(" ") ; 
		
		String Pmoto = "";
		String Qmoto = "";
		for(int n=0; n<N; n++) {
			Pmoto += P[n];
			Qmoto += Q[n];
		}
		
		int countP = 0;
		int countQ = 0;
		
		ArrayList<String> zenbu = new ArrayList<String>();
		new Main().jisyo("", zenbu);
		
		for(int a=0; a<zenbu.size(); a++) {
			if(zenbu.get(a).equals(Pmoto)) {
				countP = a+1;
			}
			if(zenbu.get(a).equals(Qmoto)) {
				countQ = a+1;
			}
		}
		
		System.out.println(Math.abs(countP-countQ));	
		
	}
	
	//辞書
	private void jisyo(String s, ArrayList<String> zenbu) {
		if(s.length() == N) {
			zenbu.add(s);
		}
		digit: 
		for(int i=1; i<=N; i++) {
			for(int j=0; j<s.length(); j++) {
				if(Character.getNumericValue(s.charAt(j)) == i) {
					continue digit;
				}
			}
			jisyo(s + Integer.toString(i),zenbu);
		}
	}
}