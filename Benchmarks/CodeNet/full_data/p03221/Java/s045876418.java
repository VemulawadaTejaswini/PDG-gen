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
			pref_year_i.add(inputs[0] + "_" + inputs[1] + "_" + i);
		}		
		Collections.sort(pref_year_i);
		
		// 年を県内の市のカウントで置き換えiでソート
		ArrayList<String> i_pref_num = new ArrayList<>(m);
		int prevP = 0;
		int c_inP = 0;
		for ( String s : pref_year_i ) {
			String p_y_i[] = s.split("_");
			int p = Integer.parseInt(p_y_i[0]);
			// 新出の県の場合
			if(prevP != p) {
				prevP = p;
				c_inP = 1;
				i_pref_num.add(p_y_i[2] + "_" + p + "_" + c_inP);				
			}
			// 既出の県の場合
			else {
				c_inP++;
				i_pref_num.add(p_y_i[2] + "_" + p + "_" + c_inP);
			}			
		}
		Collections.sort(i_pref_num);
		
		for ( String s : i_pref_num ) {
			String i_p_n[] = s.split("_");
			String pCode = String.format("%6s", i_p_n[1]).replace(' ', '0');
			String cCode = String.format("%6s", i_p_n[2]).replace(' ', '0');
			System.out.println(pCode + cCode);			
		}
		br.close();
	}
}