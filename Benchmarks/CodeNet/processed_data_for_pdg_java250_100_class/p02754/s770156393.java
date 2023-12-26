public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		long n = Long.parseLong(as[0]);
		long a = Long.parseLong(as[2]);
		long b = Long.parseLong(as[1]);
		long p = n %(a+b);
		if(p > b ) {p = b;}
		System.out.println((n/(a+b))*b + p);
	}
}
