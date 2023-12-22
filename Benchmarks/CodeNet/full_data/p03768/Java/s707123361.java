//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int M = Integer.parseInt(ss0[1]);

		// 1行目個数、2行目以降文字列を配列に格納
		ss0 = new String[M];
		int[] a = new int[M];
		int[] b = new int[M];
		for(int i = 0; i < M; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			a[i] = Integer.parseInt(ss0[0]);
			b[i] = Integer.parseInt(ss0[1]);
		}

		ss0 = br.readLine().trim().split(" ", 0);
		int Q = Integer.parseInt(ss0[0]);
		int[] v = new int[Q];
		int[] d = new int[Q];
		int[] c = new int[Q];
		for(int i = 0; i < Q; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			v[i] = Integer.parseInt(ss0[0]);
			d[i] = Integer.parseInt(ss0[1]);
			c[i] = Integer.parseInt(ss0[2]);
		}

		int[] ans = new int[N+1];
		int[] sumi = new int[N+1];

		//checkInput(a);
		//checkInput(b);
		//checkInput(v);
		//checkInput(d);
		//checkInput(c);
		//checkInput(ans);
		
		//
		//
		int kiten = 0;
		int kyori = 0;
		int iro = 0;
		
		//Q回、繰り返す
		for(int i = 0; i < Q; i++){
			kiten = v[i];
			kyori = d[i];
			iro = c[i];
			
			ironuri(kiten, kyori, iro, a, b, ans, sumi);
			for(int j = 0; j < N; j++){
				sumi[j] = 0;
			}
		}

		for(int j = 1; j < N+1; j++){
			System.out.println(ans[j]);
		}

        //System.out.println(ans);
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

	//
	static void ironuri(int kiten, int kyori, int iro, int[] a, int[] b, int[] ans, int[] sumi) {
		dp("　初期値：kiten=["+kiten+"], kyori=["+kyori+"]");
		if(kyori<0) {
			dp("距離マイナス");
			return;
		}
		if(sumi[kiten]==1) {
			dp("×枝きり：kiten=["+kiten+"], sumi[kiten]=["+sumi[kiten]+"]");
			return;
		}
		////距離分繰り返す
		//for(int k=0; k < kyori; k++) {
		//			dp("k=["+k+"]");
		for(int j=0; j<a.length; j++){
					dp("j=["+j+"], a[j]=["+a[j]+"], b[j]=["+b[j]+"], kiten=["+kiten+"]");
			if(a[j]==kiten){
				ans[a[j]]=iro;
				sumi[a[j]]=1;
						dp("●色塗1：kiten=["+kiten+"], sumi[kiten]=["+sumi[kiten]+"]");
				ironuri(b[j], kyori-1, iro, a, b, ans, sumi);
			}
			if(b[j]==kiten){
				ans[b[j]]=iro;
				sumi[b[j]]=1;
						dp("●色塗2：kiten=["+kiten+"], sumi[kiten]=["+sumi[kiten]+"]");
				ironuri(a[j], kyori-1, iro, a, b, ans, sumi);
			}
		}
		//}
	}

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
	static void checkInput(long[] i1) {
		StringBuilder sb = new StringBuilder();
		for(long i: i1) sb.append("[" + i + "]");
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

//-----------------------------------------------------------
//-----------------------------------------------------------
