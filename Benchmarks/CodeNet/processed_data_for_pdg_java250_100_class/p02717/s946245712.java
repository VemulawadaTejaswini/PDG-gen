public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		int tmp = x;
		x = y;
		y = tmp;
		tmp = x;
		x = z;
		z = tmp;
		System.out.println(x + " "+ y+ " " + z);
	}
}
