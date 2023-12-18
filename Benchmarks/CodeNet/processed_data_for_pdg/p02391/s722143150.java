public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long a = Long.parseLong(strArr[0]);
		long b = Long.parseLong(strArr[1]);
		String mark = (a > b? ">" : (a == b ? "==" : "<"));
		System.out.printf("a %s b%n", mark);
	}
}
