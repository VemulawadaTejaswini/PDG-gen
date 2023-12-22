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
		long H = Long.parseLong(ss0[0]);
		long W = Long.parseLong(ss0[1]);

		dp("H=" + H);
		dp("W=" + W);
		
		long s1;
		long s2;
		long s3;
		long sMax;
		long sMin;
		
		if((H==1)||(W==1)){
			
			s1 = (H*W) / 3;
			s2 = ((H*W) - s1) / 2;
			s3 = (H*W) - s1 - s2;

			sMax = s1;
			sMax = (sMax > s2) ? sMax : s2;  //Max
			sMax = (sMax > s3) ? sMax : s3;  //Max

			sMin = s1;
			sMin = (sMin < s2) ? sMin : s2;  //Max
			sMin = (sMin < s3) ? sMin : s3;  //Max

			dp("sMax=" + sMax);
			dp("sMin=" + sMin);
			
			System.out.println(sMax - sMin);
			
			return;
		}
		
		
		long sKari = (H*W) / 3;
		long amari = (H*W) % 3;
		if ( amari > 0) { sKari += 1; }

		dp("sKari=" + sKari);
		dp("amari=" + amari);
		
		long h = 1;
		long a=0;
		long b=0;
		while (h <= H){
		dp("  h=" + h);
			a = (W * h);
			if ( a >= sKari ) {
				if ((a - sKari) > (sKari - b)) { h -= 1; }
				break;
			}
			b = a;
			h += 1;
		}
		long w = 1;
		while (w <= W){
		dp("  w=" + w);
			a = (H * w);
			if ( a >= sKari ) {
				if ((a - sKari) > (sKari - b)) { w -= 1; }
				break;
			}
			b = a;
			w += 1;
		}
		
		dp("h=" + h);
		dp("w=" + w);

		if ((W * h) <= (H * w)) {
			s1 = h*W;
			H -= h;
		}else{
			s1 = w*H;
			W -= w;
		}
		dp("s1=" + s1);
		dp("H=" + H);
		dp("W=" + W);
		
		//
		sKari = (H*W) / 2;
		amari = (H*W) % 2;
		if ( amari > 0) { sKari += 1; }
		
		h = 1;
		while (h <= H){
			if ( (W * h) >= sKari ) { break; }
			h += 1;
		}
		w = 1;
		while (w <= W){
			if ( (H * w) >= sKari ) { break; }
			w += 1;
		}
		//long s2;
		//long s3;
		if ((W * h) <= (H * w)) {
			s2 = h*W;
		}else{
			s2 = w*H;
		}
		s3 = W*H - s2;

		dp("s2=" + s2);
		dp("s3=" + s3);
		
		
		sMax = s1;
		sMax = (sMax > s2) ? sMax : s2;  //Max
		sMax = (sMax > s3) ? sMax : s3;  //Max

		sMin = s1;
		sMin = (sMin < s2) ? sMin : s2;  //Max
		sMin = (sMin < s3) ? sMin : s3;  //Max

		dp("sMax=" + sMax);
		dp("sMin=" + sMin);
		
		System.out.println(sMax - sMin);


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
					// 入力値確認
					static void checkInput(int[][] i2) {
						StringBuilder sb = new StringBuilder();
						for(int[] i1: i2){
							for(int i: i1) sb.append("[" + i + "]");
							sb.append(System.getProperty("line.separator"));
						}
						System.out.println(sb);
					}
					// 入力値確認
					static void checkInput(char[][] i2) {
						StringBuilder sb = new StringBuilder();
						for(char[] i1: i2){
							//for(char i: i1) sb.append("[" + i + "]");
							for(char i: i1) sb.append(""+i);
							sb.append(System.getProperty("line.separator"));
						}
						System.out.println(sb);
					}


}
