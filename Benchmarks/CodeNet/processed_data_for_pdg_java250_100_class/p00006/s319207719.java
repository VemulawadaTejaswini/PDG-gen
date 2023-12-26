public class Main {
	public static void main(String[] a) throws IOException{
		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));
		String t = null;
		while  ((strLine = stdReader.readLine()) != null) {
			t = strLine;
		}
		;
		StringBuffer sb = new StringBuffer(t);
		strLine = sb.reverse().toString();
			System.out.println(strLine);
	}
}
