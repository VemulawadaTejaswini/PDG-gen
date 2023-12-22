import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String strr = br.readLine();
			int K = Integer.parseInt(strr);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<str.length();i++) {
				if(K > ('z' - str.charAt(i) + 1)) {
					sb.append('a');
					K -= 'z' - str.charAt(i) + 1;
				}else if(K > 0 && i == str.length()-1){
					sb.append(Character.toChars('a' + (str.charAt(i)+K - 'a')%26));
				}else {
					sb.append(str.charAt(i));
				}
			}

			System.out.println(sb);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
