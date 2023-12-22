import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目数字、2行目文字
		String s = br.readLine();

		String r = "B+";
		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(s);
		s = m.replaceAll("B");

		r = "W+";
		p = Pattern.compile(r);
		m = p.matcher(s);
		s = m.replaceAll("W");


		//StringBuilder sb = new StringBuilder();

		int i = s.length() -1;
		
		i = i > 0 ? i : 0;
		
		System.out.println(i);
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
