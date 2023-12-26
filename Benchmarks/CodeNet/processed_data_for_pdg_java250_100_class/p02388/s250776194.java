public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long x = Long.parseLong(br.readLine());
		System.out.println(x * x * x);
	}
}
