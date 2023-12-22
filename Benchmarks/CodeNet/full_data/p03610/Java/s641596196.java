import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		String build="";
		str=bfr.readLine();
		int mojisu=str.length();

		for(int i=0; i<mojisu; i+=2) {
			build+=str.charAt(i);
		}
		System.out.println(build);
	}
}