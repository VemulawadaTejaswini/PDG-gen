import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input = br.readLine();
		int len = input.length();
		int con = 0;
		if(len > 1) {
			//文字列の個数から2個選ぶときの組み合わせ 文字数の順列 / 2の階乗
		 con = (len * (len -1))/2;
		}else {
			con =1;
		}
		int conCount= 0;
		String []s = input.split("");
		int beforLen = input.length();
		String afterString = input.replace(s[0], "");
		int afterLen = afterString.length();
		int result = 0;
		int sa = beforLen - afterLen;
		if(afterLen == 0) {
			result = 1;
		}else {
			if(sa > 1) {
				conCount += (sa * (sa-1))/2;
			}
			s = afterString.split("");
		}
		while(afterString.length() > 0) {
			beforLen = afterString.length();
			afterString = afterString.replace(s[0], "");
			afterLen = afterString.length();
			sa = beforLen - afterLen;
			if(sa > 1) {
				conCount += (sa * (sa-1))/2;
			}
			//else {
				//conCount++;
			//}
			s = afterString.split("");
		}

		if(result == 0) {
			result = con - conCount+1;
		}
		System.out.println(result);
	}
}