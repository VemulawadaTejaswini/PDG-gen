public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x,cube;
		x = Integer.parseInt(br.readLine());
		cube = x * x * x;
		System.out.println(cube);
		br.close();
	}
}
