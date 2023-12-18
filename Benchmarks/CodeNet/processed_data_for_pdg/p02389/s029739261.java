public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = 
		  new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] st = str.split(" ");
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		System.out.println(a*b+" "+2*(a+b));
	}
}
