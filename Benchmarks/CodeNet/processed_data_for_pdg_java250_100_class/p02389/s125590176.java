public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		String[] a = str.split(" ", 0);
		int[] b = new int[2];
		b[0] = Integer.parseInt(a[0]);
		b[1] = Integer.parseInt(a[1]);
		System.out.println((b[0] * b[1]) +" " + (b[0]*2 + b[1]*2));
	}
}
