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
			//	System.out.println("sb=[" + sb + "]");
			//	System.out.println("iCount=[" + iCount + "]");
		
		
		//26以上残っているなら、26を一単位として消す
		iCount = iCount % 26;
				//System.out.println("iCount=[" + iCount + "]");
		
		// 残った回数を使い切る
		if (iCount > 0) {
			int n = iLen - 1;
			c = sb.charAt(n);
						//System.out.println("c=[" + c + "]");
			
			int k = Character.getNumericValue(c); // 10-35
			k = k - 10;  // 0-25
						//System.out.println("k=[" + k + "]");
			int j = (k + iCount);
						//System.out.println("j=[" + j + "]");
			j = (j % 26); // 0-25
			j = j + 10;
			char a = Character.forDigit(j, 36);
						System.out.println("a=[" + a + "]");
			
			sb.setCharAt(n, a);
		}
		
		System.out.println(sb);

    }
}


