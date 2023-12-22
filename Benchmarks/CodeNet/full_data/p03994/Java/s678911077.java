import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 1行目数字、2行目文字
		String s = br.readLine();
		int iCount = Integer.parseInt(br.readLine());

		int iLen = s.length();

		StringBuilder sb = new StringBuilder();
		sb.append(s);
					//System.out.println(sb);
		
		char c;
		int iCharNo;
		int i;
		// 先頭から順に各文字を、'a'に変える
		for(i = 0; i<iLen; i++){
			c = sb.charAt(i);
			iCharNo = Character.getNumericValue(c);
			// a以外
			if (iCharNo > 10) {
				//aに変える回数が残ってるなら、変える
				if(iCount >= (36 - iCharNo)){
					iCount = iCount - (36 - iCharNo);
					sb.setCharAt(i, 'a');
				}
			}
		}
				//System.out.println("sb=[" + sb + "]");
				//System.out.println("iCount=[" + iCount + "]");
		
		// 残った回数を使い切る
		int n = iLen - 1;
		c = sb.charAt(n);
		sb.setCharAt(n, Character.forDigit((Character.getNumericValue(c) + iCount), 36));
		
		System.out.println(sb);

    }
}


