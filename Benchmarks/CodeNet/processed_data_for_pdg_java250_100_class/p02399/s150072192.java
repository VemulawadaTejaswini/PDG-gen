public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		int a= Integer.parseInt(data[0]);
		int b= Integer.parseInt(data[1]);
		System.out.printf("%d %d %6f", a/b,a%b,(double)a/b);
	}
}
