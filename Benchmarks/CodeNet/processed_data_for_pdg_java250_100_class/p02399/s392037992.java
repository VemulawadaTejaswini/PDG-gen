public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		 String[] strAry = str.split(" ");
		 int a = Integer.parseInt(strAry[0]);
		 int b = Integer.parseInt(strAry[1]);
		 int d =	a / b;		
		 int r =	a % b;		
		 double f = (double)a / (double)b;	
		 System.out.printf("%d %d %.7f\n", d, r, f);
    }
}
