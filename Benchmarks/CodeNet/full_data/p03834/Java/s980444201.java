import java.io.*;
class haiku {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		for(int i=0;i<s.length();++i) {
			if(s.charAt(i)==',') pw.print(' ');
			else pw.print(s.charAt(i));
		}
		pw.print('\n');
		pw.flush();
	}
} 