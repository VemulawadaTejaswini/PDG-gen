import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ◆縦の個数、横の個数、1桁数字が連続
		//	3 3
		//	123
		//	234
		//	345

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int H = Integer.parseInt(ss0[0]);
		int W = Integer.parseInt(ss0[1]);
		int Q = Integer.parseInt(ss0[2]);

		// 2行目以降、数字が連なる。1桁で区切る
		//番兵君でやる。周りを0で囲む。配列は0で初期化されるので、代入時に+1ずらせばOK
		// 00000
		// 01230
		// 02340
		// 03450
		// 00000
		String s = "";
		int kabe = 1;
		int[][] ii = new int[H+(kabe*2)][W+(kabe*2)];  //0で初期化される
		int[][] zz = new int[H+(kabe*2)][W+(kabe*2)];  //0で初期化される

		for(int i = 0; i < H; i++){
			s = br.readLine();
			for(int j = 0; j < W; j++){
				if(s.charAt(j)=='1') { ii[i+kabe][j+kabe] = 1; }
			}
		}
					////入力値確認
					//checkInput(ii);

		int x1;
		int x2;
		int y1;
		int y2;
		int a;
		int h;
		int w;
		
		for(int q=0; q<Q; q++) {
			x1=0; x2=0; y1=0; y2=0;
			a=0; h=0; w=0;

			ss0 = br.readLine().trim().split(" ", 0);
			x1 = Integer.parseInt(ss0[0]);
			y1 = Integer.parseInt(ss0[1]);
			x2 = Integer.parseInt(ss0[2]);
			y2 = Integer.parseInt(ss0[3]);
			
			
			for(int i=1; i<=H; i++){
				Arrays.fill(zz[i], 0);
			}
			for(int i=x1; i<=x2; i++){
			for(int j=y1; j<=y2; j++){
				zz[i][j] = ii[i][j];
			}
			}
			for(int i=x1; i<=x2; i++){
			for(int j=y1; j<=y2; j++){
				a += zz[i][j];
				h += ( (zz[i][j]+zz[i+1][j])==2 ) ? 1 : 0;
				w += ( (zz[i][j]+zz[i][j+1])==2 ) ? 1 : 0;

				//System.out.print("(");
				//System.out.print(i + ", ");
				//System.out.print(j + ", ");
				//System.out.print(a + ", ");
				//System.out.print(h + ", ");
				//System.out.print(w + ") ");
				//System.out.println();
			}
			}
			//System.out.print("(");
			//System.out.print(a + ", ");
			//System.out.print(h + ", ");
			//System.out.print(w + ") ");
			
			System.out.println(a-h-w);
		}
		return;
	}
	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }

    //-----------------------------------------------------------------
	// 入力値確認
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}





}
