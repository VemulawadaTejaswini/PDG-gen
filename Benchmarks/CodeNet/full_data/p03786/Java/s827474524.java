//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		// 1行目数字
		long N = Integer.parseInt(br.readLine());

		// 2行目、複数数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		long[] ll = new long[ss0.length];  //0で初期化される
		for(int i=0; i<ll.length; i++) ll[i] = Long.parseLong(ss0[i]);

				//	checkInput(ll);

		Arrays.sort(ll);
				//	checkInput(ll);

		long ans = 0;
		long sam = 0;
		long l = ll[0];
		for(int i=0; i+1<ll.length; i++) {
			//自分より一つ上を吸収できるなら、生き残れる
			if ( (l*2) >= ll[i+1] ) {
				//吸収して大きくなる
				l += ll[i+1];
				ans += 1;
				//System.out.print("OK ");
				//System.out.println(i+" sam="+sam+"  l="+l);
			} else {
				//吸収できない場合
				l = ll[i+1] + ll[i] + sam;
				ans = 0;
				//System.out.print("NG ");
				//System.out.println(i+" sam="+sam+"  l="+l);
			}
			sam += ll[i];
		}

		System.out.println(ans + 1);
        return;
    }
    //-----------------------------------------------------------------

	//-----------------------------------------------------------------
	// 入力値確認
	static void checkInput(long[] i1) {
		StringBuilder sb = new StringBuilder();
			for(long i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		System.out.println(sb);
	}

}
