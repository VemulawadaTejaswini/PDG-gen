import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String line=in.readLine();
		
		StringBuffer out=new StringBuffer();
		
		for (int i = 0; i < line.length(); i++) {
			char c=line.charAt(i);
			if(c=='B'){
				if(out.length()!=0)
					out.deleteCharAt( out.length()-1);
			}else{
				out.append(c+"");
			}
		}
		
		System.out.println(out);
	}
}
