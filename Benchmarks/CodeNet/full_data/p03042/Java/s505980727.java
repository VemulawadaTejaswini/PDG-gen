import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] S = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
		String[] S = sc.nextLine().split("");
		
		int v_mae   = Integer.parseInt(S[0]+S[1]);
		int v_usiro = Integer.parseInt(S[2]+S[3]);
		boolean yymm_flg = false;
		boolean mmyy_flg = false;
		
		if(1 <= v_mae && v_mae <= 99 && 1 <= v_usiro && v_usiro <= 12 ) {
			yymm_flg=true;
		}
		if(1 <= v_usiro && v_usiro <= 99 && 1 <= v_mae && v_mae <= 12 ) {
			mmyy_flg=true;
		}
		
		if(yymm_flg && !mmyy_flg) {
			System.out.print("YYMM");
		}
		else if(!yymm_flg && mmyy_flg) {
			System.out.print("MMYY");
		}
		else if(yymm_flg && mmyy_flg) {
			System.out.print("AMBIGUOUS");
		}
		else {
			System.out.print("NA");
		}
	}
}
