public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int x = Integer.parseInt(num);
        int ans = (int) Math.pow(x, 3);
        System.out.println(ans);
	}
}
