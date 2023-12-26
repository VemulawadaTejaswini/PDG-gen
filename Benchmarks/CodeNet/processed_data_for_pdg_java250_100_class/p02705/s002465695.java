public class Main {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(in.readLine());  
		System.out.println(2 * r * Math.PI);
	}
}
