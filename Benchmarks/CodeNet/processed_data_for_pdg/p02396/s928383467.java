public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String streamLine;
		for (int i = 1;  ; i++) {
			streamLine = br.readLine();
			if ( streamLine.equals("0")) break;
			System.out.println("Case " + i + ": " + streamLine);
		} 
	}
}
