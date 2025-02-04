import java.io.*;
class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException {
		st.nextToken();
		return (int)st.nval;
	}
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int sx = nextInt(), sy = nextInt(), tx = nextInt(), ty = nextInt();
		for(int i=sy;i<ty;++i) pw.print('U');
		for(int i=sx;i<tx;++i) pw.print('R');
		for(int i=sy;i<ty;++i) pw.print('D');
		for(int i=sx;i<tx;++i) pw.print('L');
		pw.print('L');
		for(int i=sy;i<=ty;++i) pw.print('U');
		for(int i=sx;i<=tx;++i) pw.print('R');
		pw.print("DR");
		for(int i=sy;i<=ty;++i) pw.print('D');
		for(int i=sx;i<=tx;++i) pw.print('L');
		pw.print("U\n");
		pw.flush();
	}
}