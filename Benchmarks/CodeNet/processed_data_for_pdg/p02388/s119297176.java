public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int no=0;
		try {
			String buf = br.readLine();
			no = Integer.parseInt(buf);
		} catch (Exception e) {
			no = 0;
		}
		int Ans=(int)Math.pow(no, 3.0);
		System.out.println(Ans);
	}
}
