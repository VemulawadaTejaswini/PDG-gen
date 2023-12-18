public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arrInt = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");
		int a = Integer.parseInt(arrInt[0]);
		int b = Integer.parseInt(arrInt[1]);
		if(a < b) System.out.println("a < b");
		else if(a > b) System.out.println("a > b");
		else System.out.println("a == b");
	}
}
