import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]); // 県の個数
		int m = Integer.parseInt(inputs[1]); // 市の個数

		// 県、年でソート
		ArrayList<String> pref_year_i = new ArrayList<>(m);
		for ( int i = 1; i <= m; i++ ) {
			inputs = br.readLine().split(" ");
			pref_year_i.add(inputs[0] + "_" + String.format("%10s", inputs[1]).replace(' ', '0') + "_" + i);
		}		
		Collections.sort(pref_year_i);
		
		// 年を県内の市のカウントで置き換えiでソート
		ArrayList<String> i_pref_cnum = new ArrayList<>(m);
		int pref = 0;
		int cnum = 0;
		for ( String s : pref_year_i ) {
			String p_y_i[] = s.split("_");
			int p = Integer.parseInt(p_y_i[0]);
			// 新出の県の場合
			if(pref != p) {
				pref = p;
				cnum = 1;
				i_pref_cnum.add(p_y_i[2] + "_" + pref + "_" + cnum);				
			}
			// 既出の県の場合
			else {
				cnum++;
				i_pref_cnum.add(p_y_i[2] + "_" + pref + "_" + cnum);
			}			
		}
		Collections.sort(i_pref_cnum);
		
		for ( String s : i_pref_cnum ) {
			String i_p_n[] = s.split("_");
			String pCode = String.format("%6s", i_p_n[1]).replace(' ', '0');
			String cCode = String.format("%6s", i_p_n[2]).replace(' ', '0');
			System.out.println(pCode + cCode);			
		}
		br.close();
	}
}