public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String[] sidesStr = input.readLine().split(" ");
		int length = Integer.parseInt(sidesStr[0]);
		int side = Integer.parseInt(sidesStr[1]);
		System.out.println(length * side + " " + (length * 2 + side * 2));
	}
}
