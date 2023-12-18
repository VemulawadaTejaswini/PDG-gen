public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int b = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
		String ab = "";
		if(a == b) ab = "==";
		else if(a > b) ab = ">";
		else ab = "<";
		System.out.println("a " + ab + " b");
	}
}
