public class Main {
	public static void main(String[] args) throws Exception {
		String[] str;
		int a, b;
		int menseki, shunonagasa;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ", 0);
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        menseki = a * b;
        shunonagasa = 2 * (a + b);
        System.out.println(menseki + " " + shunonagasa);
	}
}
