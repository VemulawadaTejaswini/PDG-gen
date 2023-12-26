public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		 String[] strAry = str.split(" ");
		 int a = Integer.parseInt(strAry[0]);
		 int b = Integer.parseInt(strAry[1]);
		 int c = Integer.parseInt(strAry[2]);
		 Arrays.sort(strAry);
		 System.out.println(strAry[0] + " " +strAry[1] + " " +strAry[2]);
	}
}
