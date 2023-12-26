public class Main {
	public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str[] = br.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	int m = Integer.parseInt(str[1]);
	br.close();
	int cnt;
	if(n % m == 0) {
		cnt = n / m;
	} else {
		cnt = (int) (Math.floor(n / m) + 1);
	}
	System.out.println(cnt);
	}
}
