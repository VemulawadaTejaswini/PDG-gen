public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int x = Integer.parseInt(tmpArray[0]);
		int y = Integer.parseInt(tmpArray[1]);
		System.out.println((x*y)+" "+(2*(x+y)));
	}
}
