import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int onedan=0;
		str=bfr.readLine();
		onedan=Integer.parseInt(str);
		str=bfr.readLine();
		onedan=onedan-Integer.parseInt(str);
		str=bfr.readLine();
		onedan=onedan%(Integer.parseInt(str));
		System.out.println(onedan);
	}
}