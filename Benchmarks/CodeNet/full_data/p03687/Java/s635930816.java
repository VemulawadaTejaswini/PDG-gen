import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行目数字、2行目文字
		String s = br.readLine();

		int[] i2 = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			i2[s.charAt(i) - 'a'] += 1;
		}
		
		//checkInput(i2);
		
		//種類数を調べる
		int k=0;
		for(int i:i2) if(i>0){ k += 1; }
		//1種なら、即時終了
		if(k==1){ System.out.println(0); return; }
		
		dp("a ---");
		
		//文字数と種類数が同じ
		int ans;
		ans = (int)( (s.length()-1)/2.0 + 0.5);
		if(k==s.length()){ System.out.println( ans ); return; }
		
		dp("b ---");
		//同じ文字がある
		for(int i=0; i<26; i++){
			if(i2[i]>0){
				char c = Character.forDigit(i+10, 36);
				dp("c=["+c+"]");
				int count = 0;
				int max=0;
				for(int j=0; j<s.length(); j++){
					if(s.charAt(j)==c){
						max = (max > count) ? max : count;
						dp("c=[" +c +"], ans=["+ans+"]");
						count = 0;
					}else{
						count += 1;
					}
				}
				max = (max > count) ? max : count;
				ans = (max < ans) ? max : ans;
			}
		}
		
		dp("c ---");
		

//後ろをは削るだけ
//前を削ると、コピーもできる
//前にしか、文字をコピーできない

//全部違うなら、int((N-1)／2 + 0.5)
//同じのがあるなら、Xの前の個数、一番後ろの個数、で一番大きいのが最低回数


	System.out.println(ans);
	return;
	}
	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		//System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }


	//-----------------------------------------------------------------
	// 入力値確認：リスト
	static void checkInput(List l) { System.out.println(l); }
	//-----------------------------------------------------------------
	// 入力値確認：配列、1次元、float型
	//   ＜使い方＞
	//     float[] f = new float[N];
	//     checkInput(f);
	static void checkInput(float[] i1) {
		StringBuilder sb = new StringBuilder();
		for(float i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、1次元、int型
	//   ＜使い方＞
	//     int[] c = new int[N];
	//     checkInput(c);
	static void checkInput(int[] i1) {
		StringBuilder sb = new StringBuilder();
		for(int i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、二次元、int型
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、二次元、int型
	static void checkInput(long[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(long[] i1: i2){
			for(long i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}

}
