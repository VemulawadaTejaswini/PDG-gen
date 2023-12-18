public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		String strAry[] =str.split(" ");
		int x=Integer.parseInt(strAry[0]);
		int y=Integer.parseInt(strAry[1]);
		System.out.println(x*y+" "+(2*x+2*y));
	}
}
