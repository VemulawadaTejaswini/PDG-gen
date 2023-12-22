//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		long N = Long.parseLong(ss0[0]);  // 人数　－＞行数
		long K = Long.parseLong(ss0[1]);  // 待ち猶予時間

		String s0 = br.readLine();


		//ABを01に変換
		String s = s0.replace('A','0').replace('B','1');
				//System.out.println(s);

		//文字列reverse
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
				//System.out.println(s);

		//2進数として扱い、10進数に変換
		long l = Long.parseLong(s, 2);
//		System.out.println(l);

		//Kを足す
		l += K;
//		System.out.println(l);

		//2進数に戻す
		s = Long.toBinaryString(l);

		//01をABに変換
		s = s.replace('0','A').replace('1','B');

		//reverseする
		sb.delete(0, sb.length());
		sb.append(s);
		sb.reverse();
		sb.append( repeat("A", s0.length() - sb.length()) );
		
		//左から文字列を桁数分取る
		s = sb.substring(0, s0.length());

		System.out.println(s);
        return;
    }
    //-----------------------------------------------------------------

	//-----------------------------------------------------------------
	// 入力値確認
	static void checkInput(long[] i1) {
		StringBuilder sb = new StringBuilder();
			for(long i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
//		System.out.println(sb);
	}

	//Repeat関数
	static String repeat(String s, long l) {
		StringBuilder sb = new StringBuilder();
		for(long i=0; i<l; i++) sb.append(s);
		return sb.toString();
	}

}
