public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String numStr = input.readLine();
		int num = Integer.parseInt(numStr);
		System.out.println(num * num * num);
	}
}
