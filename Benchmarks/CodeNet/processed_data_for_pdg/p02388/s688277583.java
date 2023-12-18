public class Main {
	public static void main(String[] args)throws IOException {
		int x,cal;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		cal = x*x*x;
		System.out.println(cal);
	}
}
